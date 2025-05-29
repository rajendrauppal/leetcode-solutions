class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        # create a DP (Dynamic Programming) table filled with 1s
        dp = [[1] * n for _ in range(m)]

        # start at [1,1] and fill dp table
        for i in range(1, m):
            for j in range(1, n):
                # number of paths to current cell is 
                # sum of paths from above and left
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1]

        # return total number of unique paths to the bottom-right corner
        return dp[m - 1][n - 1]
