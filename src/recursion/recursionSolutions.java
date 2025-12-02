package recursion;

public class recursionSolutions {
    public int factorial(int n) {
        // Base condition
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1); // recursive calls to factorial function 
    }

    public int fibonacciSeries(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return fibonacciSeries(n-1) + fibonacciSeries(n-2);
    }
}
