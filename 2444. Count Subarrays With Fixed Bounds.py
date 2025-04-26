class Solution(object):
    def countSubarrays(self, nums, minK, maxK):
        count = 0
        minPos = maxPos = badPos = -1  # new variables
        
        for i, num in enumerate(nums):  # changed loop
            if not (minK <= num <= maxK):  # new condition
                badPos = i
            if num == minK:  # check minK
                minPos = i
            if num == maxK:  # check maxK
                maxPos = i
            count += max(0, min(minPos, maxPos) - badPos)  # new count update
        
        return count
