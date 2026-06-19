class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        int left = binarySearch(nums,target,true);
        int right = binarySearch(nums,target,false);
        
        res[0] = left;
        res[1] = right;
        return res;
    }

    public int binarySearch(int[] nums,int target,boolean isLeft){
        int left = 0;
        int res = -1;
        int right = nums.length-1;

        while(left <= right){
           int mid = (right - left)/2 + left;
            if(nums[mid] > target){
                right = --mid;
            }
            else if(nums[mid] < target){
                left = ++mid;
            }
            else{
                res = mid;
                if(isLeft){
                    right = --mid;
                }else{
                    left = ++mid;
                }
            }
        }
        return res;
    }
}