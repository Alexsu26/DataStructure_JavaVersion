public class VengefulSLList<Item> extends SLList<Item> {
    SLList<Item> deletedItems;

    public VengefulSLList () {
        super();
        deletedItems = new SLList<>();
    }

    public VengefulSLList (Item x) {
        // 显式调用super可以防止调用superclass的SLList()构造函数
        super(x);
        deletedItems = new SLList<>();
    }

    @Override
    public Item removeLast() {
        Item x = super.removeLast();
        deletedItems.addLast(x);
        return x;
    }

    public void printLostItems() {
        deletedItems.printList();
    }

    public static void main(String[] args) {
        VengefulSLList<Integer> list = new VengefulSLList<>(5);
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.printList();
        list.removeLast();
        list.deletedItems.printList();
    }
}
