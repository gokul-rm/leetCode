class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] count = new int[nums.length+1];
        int miss = 0;
        int dup = 0;
        for(int num : nums){
            count[num]++;
        }

        for(int i=0;i<count.length-1;i++){
            if(count[i+1] == 0) miss = i+1;
            if(count[i+1] == 2) dup = i+1;
        }

        return new int[]{dup,miss};
    }
}