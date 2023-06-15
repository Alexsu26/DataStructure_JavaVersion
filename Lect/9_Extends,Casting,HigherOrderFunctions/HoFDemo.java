public class HoFDemo {

    /** Demonstrate high order functions */
    public static int do_twice(IntUnaryFunction f, int x) {
        return f.apply(f.apply(x));
    }

    public static void main(String[] args) {
        IntUnaryFunction tenX = new TenX();
        System.out.println(do_twice(tenX, 2));
    }
}
