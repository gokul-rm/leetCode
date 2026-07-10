class Solution {
    public int[] transformArray(int[] nums) {
        int left = 0, right = nums.length-1, res[] = new int[nums.length];

        for(int num : nums){
            if(num%2 == 0) res[left++] = 0;
            else res[right--] = 1;
        }
        return res;
    }
}