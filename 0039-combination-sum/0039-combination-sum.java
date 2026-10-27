class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] cand, int tar) {
        backTrack(cand,tar,0,new ArrayList<>());
        return res;
    }

    void backTrack(int[] arr, int tar, int idx, List<Integer> list){
        if(tar == 0){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = idx;i<arr.length;i++){
            if(tar-arr[i] < 0) continue;
            list.add(arr[i]);
            backTrack(arr, tar-arr[i], i, list);
            list.remove(list.size()-1);
        }
    }
}