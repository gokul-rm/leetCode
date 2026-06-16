class Solution {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        

        backTrack(candidates,target,0,new ArrayList<>());
        return list;
    }

    public void backTrack(int[] nums, int target, int start, ArrayList<Integer> curr){
        if(target == 0){
            list.add(new ArrayList<>(curr));
            return;
        }

        if(target < 0) return;

        for(int i=start;i<nums.length;i++){
            curr.add(nums[i]);
            backTrack(nums,target - nums[i],i,curr);
            curr.remove(curr.size() - 1);
        }
    }
}