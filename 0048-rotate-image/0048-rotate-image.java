class Solution {
    public void rotate(int[][] mat) {
        int n = mat.length;
        int[][] res = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
                res[n-i-1][j] = mat[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
                mat[i][j] = res[j][i];
            }
        }
    }
}