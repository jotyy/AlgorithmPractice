package dp

class Fibonacci {
    fun fib(N: Int): Int {
        if (N < 1) {
            return 0
        }
        val memo = IntArray(N)
        return helper(memo, N)
    }

    fun dpFib(N: Int): Int {
        val dp = IntArray(N + 1)
        // base case
        dp[1] = 1
        dp[2] = 1
        for (i in 3..N) {
            dp[i] = dp[i - 1] + dp[i - 2]
        }
        return dp[N]
    }

    private fun helper(memo: IntArray, n: Int): Int {
        // base case
        if (n == 1 || n == 2) {
            return 1
        }
        // calculated
        if (memo[n] != 0) {
            return memo[n]
        }
        memo[n] = helper(memo, n - 1) + helper(memo, n - 2)
        return memo[n]
    }
}
