package Exercises;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    public void addAdjacent() {
        IntList L = this;
        while (L.rest != null) {
            if (L.first == L.rest.first) {
                L.first += L.rest.first;
                L.rest = L.rest.rest;
            }
            L = L.rest;
            if (L == null) {
                break;
            }
        }
    }

    public void addLast(int x) {
        IntList L = this;
        while (L.rest != null) {
            IntList temp = new IntList(L.first, L.rest);
            L.rest = temp;
            L = temp.rest;
        }
        L.rest = new IntList(L.first,new IntList(x, null));
    }

    public static void main(String[] args) {
        IntList L = new IntList(1, null);
        L = new IntList(1, L);
        L = new IntList(2, L);
        L = new IntList(2, L);
        L = new IntList(5, L);

//        L.addAdjacent();

        L.addLast(10);

    }
}
