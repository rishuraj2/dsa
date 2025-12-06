package recursion;

public class Factorial {
    public static int factorial(int n) {
        // Base condition
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1); // recursive calls to factorial function 
    }
}
