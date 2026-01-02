package arrays;

public class ArrayIsSortedAndRotated {
    public static boolean check(int[] nums) {
        int numsLength = nums.length;
        int startIndex = 0;
        for (int i = 0; i < numsLength - 1; i++) {
            if (nums[i] > nums[i+1]) {
                startIndex = i+1;
                break;
            }
        }

        int i = startIndex;
        while (i < startIndex + numsLength - 1) {
            if (nums[i%numsLength] > nums[(i+1)%numsLength]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
