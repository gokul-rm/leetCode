class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtrack(new ArrayList<>(),nums,new HashSet<>());
        return res;
    }
    void backtrack(List<Integer> list,int[] nums,HashSet<Integer> set){
        if(list.size() == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!set.contains(i)){
                list.add(nums[i]);
                set.add(i);

                backtrack(list,nums,set);

                list.remove(list.size()-1);
                set.remove(i);
            }
        }
    }
    
}