

class Solution:
    def maxAlternatingSum(self, nums: list[int]) -> int:
        sumOdd, sumEven = 0, 0
        for i in range(len(nums) - 1, -1, -1):
            tempOdd = max(sumOdd, sumEven - nums[i])
            tempEven = max(sumEven, sumOdd + nums[i])
            sumEven, sumOdd = tempEven, tempOdd
        return sumEven
        """ dp = {}
        def dfs(i, flag):
            if i == len(nums):
                return 0
            if (i, flag) in dp:
                return dp[(i, flag)]
            if flag:
                dp[(i, flag)] = max(dfs(i + 1, False) + nums[i], dfs(i + 1, True))
            else:
                dp[(i, flag)] = max(dfs(i + 1, True) - nums[i], dfs(i + 1, False))
            return dp[(i, flag)]
        return dfs(0, True) """


if __name__ == '__main__':
    maxAlternatingSum = Solution().maxAlternatingSum([4, 2, 5, 3])
    print(maxAlternatingSum)