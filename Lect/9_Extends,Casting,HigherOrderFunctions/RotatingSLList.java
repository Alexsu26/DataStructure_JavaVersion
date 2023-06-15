public class RotatingSLList<Item> extends SLList<Item> {

    public void rotateRight() {
        Item  x = removeLast();
        addFirst(x);
    }

    public static void main(String[] args) {
        RotatingSLList<Integer> list = new RotatingSLList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.printList();
        list.rotateRight();
        list.printList();
    }
}
