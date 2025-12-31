package recursion;

public class CountGoodNumbers {
    static final long MOD = 1_000_000_007;

    public static int countGoodNumbers(long n) {
        long fourPower = n/2;
        long fivePower = n-fourPower;

        return (int)(((fastPower(5, fivePower) % MOD) * (fastPower(4, fourPower) % MOD)) % MOD);
    }

    private static long fastPower (int x, long n) {
        if (n == 0)
            return 1;

        long half = fastPower(x, n/2) % MOD;

        if (n % 2 == 0)
            return half*half;
        else
            return half*half*x;
    }
}
