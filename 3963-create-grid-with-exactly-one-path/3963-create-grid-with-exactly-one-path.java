class Solution {
    public String[] createGrid(int m, int n) {
        String[] res = new String[m];
        StringBuilder init = new StringBuilder();
        for(int i=0;i<n;i++){
            init.append('.');
        }
        res[0] = init.toString();

        StringBuilder sb = new StringBuilder();
            for(int i=0;i<n-1;i++){
                sb.append('#');
            }
            sb.append('.');
        for(int i=1;i<m;i++){
            res[i] = sb.toString();
        }

        return res;
    }
}