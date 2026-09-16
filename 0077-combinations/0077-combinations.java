class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backTrack(n,k,1,new ArrayList<>());
        return res;
    }

    void backTrack(int n, int k , int idx, List<Integer> list){
        if(list.size() == k){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = idx;i<=n;i++){
            list.add(i);
            backTrack(n,k,i+1,list);
        
        list.remove(list.size()-1);
        }
    }
}