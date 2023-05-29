/** Array based list.
 *  @author Josh Hug
 */

public class AList<MyType> {

    private MyType[] ArrNode;
    private int size;

    /** Creates an empty list. */
    public AList() {
        ArrNode = (MyType[]) new Object[10];
        size = 0;
    }

    /** resizes the Alist */
    private void resize(int newSize) {
        MyType[] temp = (MyType[]) new Object[newSize];
        System.arraycopy(ArrNode, 0, temp, 0, size);
        ArrNode = temp;
    }

    /** Inserts X into the back of the list. */
    public void addLast(MyType x) {
        if (size == ArrNode.length) {
            resize(2 * size);
        }

        ArrNode[size] = x;
        size++;
    }

    /** Returns the item from the back of the list. */
    public MyType getLast() {
        return ArrNode[size - 1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public MyType get(int i) {
        return ArrNode[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public MyType removeLast() {
        MyType temp = ArrNode[size - 1];
        ArrNode[size - 1] = null;
        size--;
        return temp;
    }
} 