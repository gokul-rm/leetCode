class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int curr = 0;
        int sum = 0;

        for(int i=2;i<nums.length;i++){
            if(nums[i-2] - nums[i-1] == nums[i-1] - nums[i]){
                curr++;
                sum += curr;
            }
            else curr = 0;
        }
        return sum;
        
    }
}