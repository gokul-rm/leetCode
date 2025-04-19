class Solution:
    def countFairPairs(self, nums: List[int], lower: int, upper: int) -> int:
        nums.sort()
        count = 0
        length = len(nums)

        for i in range(length):
            lVal = lower - nums[i]
            rVal = upper - nums[i]
            left = bisect.bisect_left(nums,lVal,i+1,length)
            right = bisect.bisect_right(nums,rVal,i+1,length)
            count += right-left
        return count
