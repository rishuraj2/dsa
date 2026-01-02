package arrays;

import java.util.*;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> countTable = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            countTable.put(nums[i], countTable.getOrDefault(nums[i], 0)+1);
        }

        for (int i : countTable.keySet()) {
            if (countTable.get(i) == 1) {
                return i;
            }
        }
        return -1;
    }
}
