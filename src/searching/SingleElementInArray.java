package searching;

public class SingleElementInArray {
    public static int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high-1) {
            int mid = low + (high - low)/2;

            if (nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]) {
                return nums[mid];
            }

            if (nums[mid] == nums[mid-1]) {
                if ((mid + 1) % 2 == 0){
                    low = mid + 1;
                } else {
                    high = mid - 2;
                }
            } else {
                if ((mid + 1) % 2 == 0) {
                    high = mid - 1;
                } else {
                    low = mid + 2;
                }
            }
        }

        return nums[low];
    }
}
