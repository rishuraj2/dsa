package strings;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String smallestWord = strs[0];

        for (String word : strs) {
            if (word.length() < smallestWord.length())
                smallestWord = word;
        }

        for (int i = smallestWord.length(); i >= 0; i-- ) {
            boolean isCommon = true;
            for (String word : strs) {
                if (!word.substring(0, i).equals(smallestWord.substring(0, i))) {
                    isCommon = false;
                }
            }
            if (isCommon) {
                return smallestWord.substring(0, i);
            }
        }

        return "";
    }
}
