class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] res = new int[nums.length*2];
        int right = nums.length*2-1;

        for(int i=0;i<nums.length;i++){
            res[i] = nums[i];
            res[right--] = nums[i];
        }
        return res;
    }
}