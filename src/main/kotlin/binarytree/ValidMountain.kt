package binarytree

class ValidMountain {
    fun validMountainArray(A: IntArray): Boolean {
        // base case
        if (A.size < 3) return false
        var i = 0
        // increase
        while (i + 1 < A.size && A[i] < A[i + 1]) {
            i++
        }

        // maximum is not at start or end
        if (i == 0 || i == A.size - 1)
            return false

        // decrease
        while (i + 1 < A.size && A[i] > A[i + 1]) {
            i++
        }

        return i == A.size - 1
    }
}
