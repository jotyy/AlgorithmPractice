package dp

class CoinChange {
    fun coinChange(coins: IntArray, amount: Int): Int {
        // 1 base case
        // 2 state: variable between original&child problem
        // 3 action: behavior caused the state change
        // 4 dp: define dp table/func
        if (amount < 1) return 0
        return helper(coins, amount, IntArray(amount))
    }

    private fun helper(coins: IntArray, rem: Int, count: IntArray): Int {
        if (rem < 0) {
            return -1
        }
        if (rem == 0) {
            return 0
        }
        if (count[rem - 1] != 0) {
            return count[rem - 1]
        }
        var min = Int.MAX_VALUE
        coins.forEach { coin ->
            // recalculate amount
            val res = helper(coins, rem - coin, count)
            if (res in 0 until min) {
                min = 1 + res
            }
        }
        count[rem - 1] = if (min == Int.MAX_VALUE) {
            -1
        } else {
            min
        }
        return count[rem - 1]
    }
}
