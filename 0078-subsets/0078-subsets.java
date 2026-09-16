class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backTrack(nums, 0, new ArrayList<>());
        return res;
    }

    void backTrack(int[] nums, int i, List<Integer> list){
        res.add(new ArrayList<>(list));

        for(int idx = i;idx<nums.length;idx++){
            list.add(nums[idx]);
            backTrack(nums, idx+1,list);
        }
        if(!list.isEmpty())
        list.remove(list.size()-1);
    }


}