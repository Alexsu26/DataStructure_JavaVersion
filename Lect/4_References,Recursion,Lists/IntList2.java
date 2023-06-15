// 练习
public class IntList2 {
    public int first;
    public IntList2 rest;

    public IntList2 (int f, IntList2 r) {
        first = f;
        rest = r;
    }

    /** Return the size of the list using... recursion! */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    /** Return the size of the list using no recursion! */
    public int iterativeSize() {
        IntList2 L = this;
        int sum = 0;
        while (L != null) {
            sum ++;
            L = L.rest;
        }
        return sum;
    }

    /** Returns the ith value in this list.*/
    public int get(int i) {
        if (i == 0) {
            return this.first;
        }
        return this.rest.get(i - 1);
    }

    public static void main(String[] args) {
        IntList2 L = new IntList2(15, null);
        L = new IntList2(10, L);
        L = new IntList2(5, L);

        System.out.println(L.get(1));
        System.out.println(L.size());
        System.out.println(L.iterativeSize());
    }
}
