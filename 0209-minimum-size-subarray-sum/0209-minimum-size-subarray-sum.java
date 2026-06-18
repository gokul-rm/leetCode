class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        int left = 0;

        for(start = 0; start<nums.length;start++){
            sum += nums[start];

            while(sum >= target){
                len = Math.min(len,start - left +1);
                sum -= nums[left++];
            }
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
}