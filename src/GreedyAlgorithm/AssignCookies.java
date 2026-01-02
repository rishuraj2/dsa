package greedyAlgorithm;

import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int result = 0;

        int i = 0;
        int j = 0;

        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                result++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return result;
    }
}
