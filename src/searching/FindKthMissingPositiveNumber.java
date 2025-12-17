package searching;

public class FindKthMissingPositiveNumber {
    public static int findKthMissingPositive(int[] arr, int k) {
        int position = 1;
        int value =  1;

        
        while (position <= k) {
            int low = 0;
            int high = arr.length - 1;

            while (low <= high) {
                int mid = low + (high - low)/2;

                if (arr[mid] == value) {
                    value++;
                    break;
                }

                if (value < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            if (low > high) {
                value++;
                position++;
            }
        }
        return value - 1;
    }
}
