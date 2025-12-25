package strings;

public class RotateString {
    public static boolean rotateString(String s, String goal) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == goal.charAt(0)) {
                String possibleString = s.substring(i, s.length()) + s.substring(0, i);
                if (possibleString.equals(goal))
                    return true;
            }
        }
        return false;
    }
}
