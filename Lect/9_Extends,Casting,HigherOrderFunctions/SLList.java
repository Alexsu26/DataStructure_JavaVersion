public class SLList<Item> {

    private static class IntNode<Item> {
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

    public int size() {
        return size;
    }

    public Item removeLast() {
        IntNode<Item> p = sentinel;
        while (p.next != null && p.next.next != null) {
            p = p.next;
        }
        Item res = p.next.item;
        p.next = null;
        size -= 1;
        return res;
    }

    public void printList() {
        IntNode<Item> p = sentinel.next;
        while (p != null) {
            System.out.print(p.item + " ");
            p = p.next;
        }
        System.out.println();
    }

}