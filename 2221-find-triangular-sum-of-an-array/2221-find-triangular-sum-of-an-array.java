class Solution {
    public int triangularSum(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int first = nums[0];
            for (int j = 1; j < nums.length - i; j++) {
                int sum = (first + nums[j]) % 10;
                first = nums[j];
                nums[j - 1] = sum;
            }
        }
        return nums[0];
    }
}