import org.w3c.dom.Node;

// mains single linked list
public class SLList<MyType> implements List<MyType>{

    public static class IntNode<MyType> {
        public MyType item;
        public IntNode<MyType> next;

        public IntNode(MyType i, IntNode<MyType> n) {
            item = i;
            next = n;
        }
    }
    private IntNode<MyType> sentinel;
    private int size;

    public SLList() {
        sentinel = new IntNode<>(null, null);
        size = 0;
    }

    public SLList(MyType x) {
        sentinel = new IntNode<>(null, null);
        sentinel.next = new IntNode<>(x, null);
        size = 1;
    }

    public void addFirst(MyType x) {
        sentinel.next = new IntNode<>(x, sentinel.next);
        size += 1;
    }

    public MyType getFirst() {
        return sentinel.next.item;
    }

    @Override
    public MyType get(int index) {
        IntNode<MyType> p = sentinel.next;
        while (p != null) {
            if (index == 0) {
                return p.item;
            }
            index -= 1;
            p = p.next;
        }
        return null;
    }

    @Override
    public void addLast(MyType x) {
        IntNode<MyType> p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode<>(x, null);
        size += 1;
    }

    /**
    private int size(IntNode p) {
        if (p.next == null) {
            return 1;
        }
        return 1 + size(p.next);
    }

    public int size() {
        return size(first);
    }
     */

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print() {
        System.out.println("This is from SLList class");
        for (IntNode<MyType> p = sentinel.next; p != null; p = p.next) {
            System.out.print(p.item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SLList<Integer> s = new SLList<>();
        s.addFirst(5);
        s.addFirst(15);
        s.addLast(33);
        IntNode<Integer> temp = s.sentinel.next;
        while (temp != null) {
            System.out.println(temp.item);
            temp = temp.next;
        }
        System.out.println(s.get(0));
        
    }
}
