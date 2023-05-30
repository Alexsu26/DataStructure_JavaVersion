public class WordUtils {
    public static String maxString(List<String> s) {
        int maxIndex = 0;
        for (int i = 0; i < s.size(); i ++) {
            String maxString = s.get(maxIndex);
            String thisString = s.get(i);
            if (thisString.length() > maxString.length()) {
                maxIndex = i;
            }
        }
        return s.get(maxIndex);
    }

    public static void main(String[] args) {
        SLList<String> s = new SLList<>();
        s.addLast("hello");
        s.addLast("world");
        s.addLast("theLongestWord");
        s.print();
    }
}
