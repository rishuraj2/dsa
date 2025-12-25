package strings;

public class ReverseWord {
    public static String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");

        String[] words = s.split(" ");
        s = "";
        for (String word : words) {
            if (s.equals("")) {
                s = word + s;
            } else {
                s = word + " " + s;
            }
        }
        return s;
    }
}
