class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int res = 0;
        Collections.sort(nums);

        int i=0, j=nums.size()-1;

        while(i<j){
            int sum = nums.get(i) + nums.get(j);
            if(sum < target){
                res += (j-i);
                i++;
            }
            else j--;
        }
        return res;
    }
}