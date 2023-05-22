// mains single linked list
public class SLList {

    public static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }
    private IntNode sentinel;
    private int size;

    public SLList() {
        sentinel = new IntNode(0, null);
    }

    public SLList(int x) {
        sentinel = new IntNode(0, null);
        sentinel.next = new IntNode(x, null);
        sentinel.item = 1;
    }

    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        sentinel.item ++;
    }

    public int getFirst() {
        return sentinel.next.item;
    }

    public void addLast(int x) {
        IntNode p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
        sentinel.item ++;
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
        return sentinel.item;
    }

    public static void main(String[] args) {
        SLList s = new SLList();
        s.addFirst(5);
        s.addFirst(15);
        s.addLast(33);
        IntNode temp = s.sentinel.next;
        while (temp != null) {
            System.out.println(temp.item);
            temp = temp.next;
        }
        System.out.println(s.size());
    }
}
