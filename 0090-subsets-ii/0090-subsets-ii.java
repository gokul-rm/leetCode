class Solution {
    Set<List<Integer>> res = new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backTrack(nums,0, new ArrayList<>());
        return new ArrayList<>(res);
    }

    void backTrack(int[] nums, int idx, List<Integer> list){
        res.add(new ArrayList<>(list));

        for(int i = idx;i<nums.length;i++){
            list.add(nums[i]);
            backTrack(nums, i+1, list);
            list.remove(list.size()-1);
        }
    }
}