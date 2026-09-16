class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTrack(candidates,target,0,new ArrayList<>());
        return res;
    }

    void backTrack(int[] arr, int target, int idx, List<Integer> list){
        if(target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }

        if(target < 0) return ;

        for(int i=idx;i<arr.length;i++){
            if(i > idx && arr[i] == arr[i-1]) continue;
            if(target-arr[i] < 0) continue;
            list.add(arr[i]);
            backTrack(arr,target-arr[i],i+1,list);
            list.remove(list.size()-1);
        }
    }
}