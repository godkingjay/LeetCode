object Solution {
    def numDistinct(s: String, t: String): Int = {
        val m = s.length
        val n = t.length

        if (m < n) {
            return 0
        }

        val dp: Array[Array[Int]] = Array.fill(m + 1, n + 1)(0)
        for (i <- 0 to m) {
            dp(i)(0) = 1
        }

        for (i <- 1 to m) {
            for (j <- 1 to n) {
                if (s(i-1) == t(j-1)) {
                    dp(i)(j) = dp(i-1)(j-1) + dp(i-1)(j)
                } else {
                    dp(i)(j) = dp(i-1)(j)
                }
            }
        }

        dp(m)(n)
    }
}
