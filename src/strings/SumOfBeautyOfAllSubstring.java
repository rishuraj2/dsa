package strings;

public class SumOfBeautyOfAllSubstring {
    private static int getBeautyNumber(String substring) {
        int[] frequencyCount = new int[26];

        for (char c : substring.toCharArray()) {
            frequencyCount[c - 'a']++;
        }

        int minFrequency = Integer.MAX_VALUE;
        int maxFrequency = 0;

        for (int freq : frequencyCount) {
            if (freq > 0) {
                minFrequency = Math.min(minFrequency, freq);
                maxFrequency = Math.max(maxFrequency, freq);
            }
        }

        return maxFrequency - minFrequency;
    }

    public static int beautySum(String s) {
        int beautyNumber = 0;
        for (int i = s.length(); i > 2; i--) {
            for (int j = 0; j <= s.length() - i; j++) {
                beautyNumber += getBeautyNumber(s.substring(j, j+i));
            }
        }
        return beautyNumber;
    }
}
