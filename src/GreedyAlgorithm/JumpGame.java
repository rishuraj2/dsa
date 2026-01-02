package greedyAlgorithm;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] == 0) {
                int stepsRequiredToSkip = 2;
                boolean canBeSkipped = false;
                for (int j = i-1; j >= 0; j--) {
                    if (nums[j] >= stepsRequiredToSkip) {
                        canBeSkipped = true;
                        break;
                    } else {
                        stepsRequiredToSkip++;
                    }
                }
                if (!canBeSkipped)
                    return false;
            }
        }

        return true;
    }
}
