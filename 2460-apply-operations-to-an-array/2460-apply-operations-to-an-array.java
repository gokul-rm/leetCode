class Solution {
    public int[] applyOperations(int[] nums) {
        int count = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] == nums[i]){
                nums[i-1] = nums[i] * 2;
                nums[i] = 0;
                count++;
            }
        }
        int idx = 0;
        boolean passed = false;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0 && passed)  nums[idx++] = nums[i];
            else if(nums[i] != 0 && !passed) idx++;
            else passed = true;
        }
        for(int i=idx;i<nums.length;i++){
            nums[idx++] = 0;
        }
        return nums;
    }
}