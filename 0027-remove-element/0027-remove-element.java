class Solution {
    public int removeElement(int[] nums, int val) {
        int idx = 0;
        boolean passed = false;

        for(int i=0;i<nums.length;i++){
            if(nums[i] != val && passed){
                nums[idx++] = nums[i];
            } else if(nums[i] != val && !passed) idx++;
            else passed = true;
        }
        return idx;
    }
}