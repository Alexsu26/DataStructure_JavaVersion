public interface List<MyType> {

    /** Inserts X into the back of the list. */
    public void addLast(MyType x);

    /** Returns the item from the back of the list. */
//    public MyType getLast();

    /** Gets the ith item in the list (0 is the front). */
    public MyType get(int i);

    /** Returns the number of items in the list. */
    public int size();

    /** Deletes item from back of the list and
     * returns deleted item. */
//    public MyType removeLast();

    /** print the list */
    default public void print() {
        for (int i = 0; i < size(); i ++) {
            System.out.print(get(i) + " ");
        }
        System.out.println();
    }

}
