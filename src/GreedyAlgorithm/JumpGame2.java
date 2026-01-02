package greedyAlgorithm;

public class JumpGame2 {
    public static int jump(int[] nums) {
        int minSteps = 0;
        int i = nums.length - 1;
         while (i > 0) {
            for (int j = 0; j < i; j++) {
                if (nums[j] >= i-j) {
                    minSteps++;
                    i = j;
                }
            }
         }
         return minSteps;
    }
}
