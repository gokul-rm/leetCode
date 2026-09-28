class Solution {
    List<List<Integer>> res  = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        if(n <= k) return res;
        backTrack(k,n,new ArrayList<>(),1,0);
        return res;
    }

    void backTrack(int k, int n, List<Integer> list,int start,int count){
        if (count > n || list.size() > k) {
            return;
        }
        if(list.size() == k && count == n){
            res.add(new ArrayList<>(list));
            return;
        }


        for(int i=start;i<=9;i++){
            list.add(i);
            backTrack(k,n,list,i+1, count + i);
            list.remove(list.size()-1);
        }


    }
}