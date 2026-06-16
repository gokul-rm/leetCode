class Solution {
    

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();

        backTrack(candidates,target,0,new ArrayList<>(),list);
        return list;
    }

    public void backTrack(int[] nums, int target, int start, List<Integer> curr,List<List<Integer>> list){
        if(target == 0){
            list.add(new ArrayList<>(curr));
            return;
        }

        if(target < 0) return;

        for(int i=start;i<nums.length;i++){
            if(nums[i] > target) continue;
            curr.add(nums[i]);
            backTrack(nums,target - nums[i],i,curr,list);
            curr.remove(curr.size() - 1);
        }
    }
}