class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] res = new int[matrix.length];
        
        for(int i=0;i<matrix.length;i++){
            int ans = 0;
            for(int num : matrix[i]){
                ans += num;
            }
            res[i] = ans;
        }
        return res;
    }
}