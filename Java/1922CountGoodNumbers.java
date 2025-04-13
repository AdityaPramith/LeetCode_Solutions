class Solution {
    private static final int MOD = 1000000007;
    public int countGoodNumbers(long n) {
          return (int) (myPow(5, (n + 1) / 2) * myPow(4, n / 2) % MOD);
    }

    private long myPow(long base, long exponent) {
        long result = 1;
        while (exponent != 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exponent >>= 1;
        }
        return result;
    }
}