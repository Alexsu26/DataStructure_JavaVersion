// mains single linked list
public class SLList<Item> {

    public static class IntNode<Item> {
        public Item item;
        public IntNode<Item> next;

        public IntNode(Item i, IntNode<Item> n) {
            item = i;
            next = n;
        }
    }
    private IntNode<Item> sentinel;
    private int size;

    public SLList() {
        sentinel = new IntNode<>(null, null);
    }

    public SLList(Item x) {
        sentinel = new IntNode<>(null, null);
        sentinel.next = new IntNode<>(x, null);
        size = 1;
    }

    public void addFirst(Item x) {
        sentinel.next = new IntNode<>(x, sentinel.next);
        size += 1;
    }

    public Item getFirst() {
        return sentinel.next.item;
    }

    public void addLast(Item x) {
        IntNode<Item> p = sentinel;
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

    public int size() {
        return size;
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
        System.out.println(s.size());
    }
}
