public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** 建议的写法 */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    public int mySize(IntList L) {
        if (L == null) {
            return 0;
        }
        return 1 + mySize(L.rest);
    }

    /** 有问题的写法

    public int size() {
        if (this == null) {
            return 0;
        }
        return 1 + this.rest.size();
    }
     如果this.rest已经等于null了，那么.size()就会发生错误
    */


    public int iterativeSize() {
        int res = 0;
        IntList p = this;
        while(p != null) {
            res ++;
            p = p.rest;
        }
        return res;
    }

    public int get(int i) {
        if (i == 0) {
            return first;
        }
        return rest.get(i - 1);
    }

    public static void main(String[] args) {
        IntList L = new IntList(10, null);
        L = new IntList(5, L);
        L = new IntList(15, L);
        System.out.println(L.size());
        System.out.println(L.iterativeSize());
    }
}
