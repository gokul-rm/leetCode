class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int minp = nums[0];
        int maxp = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i] <=0){
                int temp = maxp;
                maxp = minp;
                minp = temp;
            }
            minp = Math.max(nums[i],minp*nums[i]);
            maxp = Math.min(nums[i],maxp*nums[i]);

            res = Math.max(res,maxp);
        }
        return res;
        
    }
}