package sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    private static void merger(int[] arr, int low, int mid, int high) {
        List<Integer> arrList = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                arrList.add(arr[left++]);
            } else {
                arrList.add(arr[right++]);
            }
        }

        while(left <= mid) {
            arrList.add(arr[left++]);
        }
        while(right <= high) {
            arrList.add(arr[right++]);
        }
        
        for (int i = low; i <= high; i++) {
            arr[i] = arrList.get(i-low);
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merger(arr, low, mid, high);
    }
}
