class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        backtrack(new ArrayList<>(),nums,new HashSet<>());
        Set<List<Integer>> set = new HashSet<>();
        for(List<Integer> num : res){
            set.add(num);
        }
        return new ArrayList<>(set);
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