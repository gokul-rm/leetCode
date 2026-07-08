class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currMax = 0;
        int currMin = 0;
        int maxSum = nums[0];
        int minSum = nums[0];
        int total = 0;


        for(int num : nums){
            currMax = Math.max(currMax+num,num);
            maxSum = Math.max(maxSum,currMax);
            currMin = Math.min(currMin+num,num);
            minSum = Math.min(minSum,currMin);
            total += num;
        }
        return maxSum > 0 ? Math.max(maxSum,total-minSum) : maxSum;
    }
}