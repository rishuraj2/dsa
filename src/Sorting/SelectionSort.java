package sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr) {

        int arrLength = arr.length;

        for (int i = 0; i < arrLength; i++) {
            int lowestValueIndex = i;
            for (int j = i + 1; j < arrLength; j++) {
                if (arr[j] < arr[lowestValueIndex]) {
                    lowestValueIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[lowestValueIndex];
            arr[lowestValueIndex] = temp;
        }
    }
}
