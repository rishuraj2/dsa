import recursion.recursionSolutions;

public class app {
    public static void main(String[] args) {
        recursionSolutions solutions = new recursionSolutions();
        // int result = solutions.factorial(10); // output for factorial
        // System.out.println(result); // output for factorial

        int result = solutions.fibonacciSeries(15);
        System.out.println(result);
    }
}
