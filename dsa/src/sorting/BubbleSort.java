package sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int arrLength = arr.length;
        for (int i = 1; i < arrLength; i++) {
            for (int j = 0; j < arrLength - i; j++) {
                if (arr[j+1] < arr[j]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
