package recursion;

public class FibonacciSeries {
    public static int fibonacciSeries(int n) {
        if (n <= 1)
            return n;
        
        return fibonacciSeries(n-1) + fibonacciSeries(n-2);
    }
}
