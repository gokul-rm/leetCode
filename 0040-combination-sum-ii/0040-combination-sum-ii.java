class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(candidates);
        backtrack(0,candidates,target,new ArrayList<>(),res);
        return res;

    }

    void backtrack(int idx,int[] nums, int target, List<Integer> list, List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = idx;i<nums.length;i++){
            if(i>idx && nums[i] == nums[i-1]) continue;
            if(nums[i] > target) break;

            list.add(nums[i]);
            backtrack(i+1,nums,target-nums[i],list,res);
            list.remove(list.size()-1);
        }

    }
}