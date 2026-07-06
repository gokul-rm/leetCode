class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0,nums,new ArrayList<>());
        return res;
    }

    void backtrack(int start,int[] nums,List<Integer> list){
        res.add(new ArrayList<>(list));

        for(int i=start;i<nums.length;i++){
            list.add(nums[i]);
            backtrack(i+1,nums,list);
            list.remove(list.size()-1);
        }
    }
}