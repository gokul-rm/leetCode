class Solution {
    List<List<Integer>> res =  new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(0,nums,new ArrayList<>());
        return res;
    }

    void backtrack(int i,int[] nums, List<Integer> list){
        res.add(new ArrayList<>(list));

        for(int idx = i; idx < nums.length; idx++){
            if(idx > i && nums[idx] == nums[idx-1]) continue;
            list.add(nums[idx]);
            backtrack(idx+1 , nums,list);
            list.remove(list.size()-1);
        }
    }
}