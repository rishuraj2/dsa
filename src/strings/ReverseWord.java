package strings;

public class ReverseWord {

    //Runtime = 10ms, memory = 47.8MB

    // public String reverseWords(String s) {
    //     s = s.trim().replaceAll("\\s+", " ");

    //     String[] words = s.split(" ");
    //     s = "";
    //     for (String word : words) {
    //         if (s.equals("")) {
    //             s = word + s;
    //         } else {
    //             s = word + " " + s;
    //         }
    //     }
    //     return s;
    // }

    // Runtime = 10ms, memory = 47.5MB
    public static String reverseWords(String s) {
        int endOfWord = 0;
        int startOfWord = 0;

        boolean isEndOfWordSet = false;
        boolean isStartOfWordSet = false;

        String result = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            
            if (!isEndOfWordSet && !isStartOfWordSet) {
                if (s.charAt(i) != ' ') {
                    endOfWord = i;
                    isEndOfWordSet = true;
                }

            }
            
            if (!isStartOfWordSet && isEndOfWordSet) {
                if (!isStartOfWordSet && isEndOfWordSet) {
                    if (s.charAt(i) == ' ') {
                        startOfWord = i + 1;
                        isStartOfWordSet = true;
                    } else if (i == 0) {
                        startOfWord = 0;
                        isStartOfWordSet = true;
                    }
                }

            }

            if (isStartOfWordSet && isEndOfWordSet) {
                if (result.equals("")) {
                    result = result + s.substring(startOfWord, endOfWord+1);
                } else {
                    result = result + " " + s.substring(startOfWord, endOfWord+1);
                }
                isStartOfWordSet = false;
                isEndOfWordSet = false;
            }
        }
        return result;
    }
}
