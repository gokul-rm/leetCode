class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] == nums[i]){
                nums[i-1] = nums[i] * 2;
                nums[i] = 0;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                int k = i+1;
                while(k < nums.length){
                    if(nums[k] != 0){
                    int temp = nums[k];
                    nums[k] = nums[i];
                    nums[i] = temp;
                    break;
                    }
                    k++;
                }
            }
        }
        return nums;
    }
}