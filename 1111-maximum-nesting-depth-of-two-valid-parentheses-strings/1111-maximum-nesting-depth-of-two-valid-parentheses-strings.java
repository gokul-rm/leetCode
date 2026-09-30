class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] res = new int[seq.length()];
        int num = 0;

        for(int i=0;i<seq.length();i++){
            char ch = seq.charAt(i);
            if(ch == '('){
                res[i] = ++num % 2;
            } else{
                res[i] = num-- % 2;
            }
        }
        return res;
    }
}