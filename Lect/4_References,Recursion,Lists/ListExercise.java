public class ListExercise {
    /** Returns an IntList identical to L, but with
     * each element incremented by x. L is not allowed
     * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
        IntList p = L;
        IntList front = new IntList(p.first + x, null);
        p = p.rest;
        IntList back;
        IntList head = front;
        while (p != null) {
            back = new IntList(p.first + x, null);
            front.rest = back;
            front = front.rest;
            p = p.rest;
        }
        return head;
    }

    /** Returns an IntList identical to L, but with
     * each element incremented by x. Not allowed to use
     * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */
        IntList p = L;
        while (p != null) {
            p.first += x;
            p = p.rest;
        }
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

//        System.out.println(L.size());
//        System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.

//        IntList L1 = incrList(L, 3);
//        System.out.println(L1.get(0));
//        System.out.println(L1.get(1));
//        System.out.println(L1.get(2));
        IntList L1 = dincrList(L, 3);
        System.out.println(L1.get(0));
        System.out.println(L1.get(1));
        System.out.println(L1.get(2));
    }
}