import java.lang.reflect.Array;
import java.util.*;

public class ArraySet<T> implements Iterable<T> {

    private T[] list;
    private int size;

    public ArraySet() {
        list = (T[]) new Object[100];
        size = 0;
    }

    /* Returns true if this map contains a mapping for the specified key.
     */
    public boolean contains(T x) {
        for (int i = 0; i < size; i += 1) {
            if (list[i].equals(x)) {
                return true;
            }
        }
        return false;
    }

    /* Associates the specified value with the specified key in this map.
       Throws an IllegalArgumentException if the key is null. */
    public void add(T x) {
        if (x == null) {
            throw new IllegalArgumentException("can't add null");
        }
        if (contains(x)) {
            return;
        }
        list[size] = x;
        size += 1;
    }

    /* Returns the number of key-value mappings in this map. */
    public int size() {
        return size;
    }

    public Iterator<T> iterator() {
        return new ArraySetIterator();
    }

    private class ArraySetIterator implements Iterator<T> {
        private int wizPos;

        public ArraySetIterator() {
            wizPos = 0;
        }

        public boolean hasNext() {
            return wizPos < size;
        }

        public T next() {
            T returnItem = list[wizPos];
            wizPos += 1;
            return returnItem;
        }
    }

    /* toString method */
    /**
    @Override
    public String toString() {
        StringBuilder returnSB = new StringBuilder("{");
        for (int i = 0; i < size -1; i += 1) {
            returnSB.append(list[i]);
            returnSB.append(", ");
        }
        returnSB.append(list[size - 1]);
        returnSB.append("}");
        return returnSB.toString();
    }
    */
    @Override
    public String toString() {
        List<String> listOfItems = new ArrayList<>();
        for (T x : this) {
            listOfItems.add(x.toString());
        }
        return "{" + String.join(", ", listOfItems) + "}";
    }

    /* equals method */
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        ArraySet<T> o = (ArraySet<T>) other;
        if (this.size() != o.size()) {
            return false;
        }
        for (T item : o) {
            if (!this.contains(item)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        ArraySet<String> s = new ArraySet<>();
//        s.add(null);
        s.add("horse");
        s.add("fish");
        s.add("house");
        s.add("fish");
        System.out.println(s.contains("horse"));
        System.out.println(s.size());

        System.out.println("This is the original for-each loop");
        Iterator<String> seer = s.iterator();
        while (seer.hasNext()) {
            String returnString = seer.next();
            System.out.println(returnString);
        }

        System.out.println("This is a for-each loop test: ");
        for (String i : s) {
            System.out.println(i);
        }

        System.out.println("This is a toString method test : ");
        System.out.println(s.toString());

        ArraySet<String> s2 = new ArraySet<>();
        s2.add("horse");
        s2.add("fish");
        s2.add("house");
        s2.add("fish");
        System.out.println("This is a equals method test : " );
        System.out.println(s.equals(s2));
        System.out.println(s.equals(s));
        System.out.println(s.equals(null));
    /* Java 自带的Set可以处理null
       Set<String> s2 = new HashSet<>();
       s2.add(null);
       System.out.println(s2.contains(null));
     */
    }

    /* Also to do:
    1. Make ArraySet implement the Iterable<T> interface.
    2. Implement a toString method.
    3. Implement an equals() method.
    */
}