import java.util.Arrays;
import sorting.BubbleSort;

public class App {
    public static void main(String[] args) {
        // System.out.println("Factorial of 10 = " + Factorial.factorial(10)); // output for factorial
        // System.out.println("10th term in fibonacciSeries = " + FibonacciSeries.fibonacciSeries(10)); // output for fibonacciSeries

        int[] arr = new int[]{5, 4, 3, 2, 6, 1, 8, 2};
        // MergeSort.mergeSort(arr, 0, arr.length-1);
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}