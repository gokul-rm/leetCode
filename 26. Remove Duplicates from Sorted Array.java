class Solution {
    public int removeDuplicates(int[] nums) {
        int back =0;

        for(int front=1; front<nums.length; front++){
            if(nums[front] != nums[back]){
                back++;
                nums[back] = nums[front];
            }
        }
        return back+1;
        
    }
}
