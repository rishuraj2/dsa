package strings;

import java.util.*;

public class SortCharacterByFrequency {
    public static String frequencySort(String s) {
        Map<Character, Integer> characterCountMap = new HashMap<>();
        for (char alphabet : s.toCharArray()) {
            characterCountMap.put(alphabet, characterCountMap.getOrDefault(alphabet, 0) + 1);
        }

        List<Character>[] bucket = new List[s.length() + 1];

        for (char alphabet : characterCountMap.keySet()) {
            int frequency = characterCountMap.get(alphabet);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(alphabet);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = bucket.length - 1; i >= 1; i--) {
            if (bucket[i] != null) {
                for (char alphabet : bucket[i]) {
                    sb.append(String.valueOf(alphabet).repeat(i));
                }
            }
        }
        return sb.toString();
    }
}
