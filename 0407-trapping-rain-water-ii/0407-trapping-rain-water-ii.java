class Solution {
    public int trapRainWater(int[][] h) {
        int m = h.length;
        int n = h[0].length;

        boolean[][] visited = new boolean[m][n];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[2]-b[2]);

        for(int i=0;i<m;i++){
            pq.offer(new int[]{i,0,h[i][0]});
            pq.offer(new int[]{i,n-1,h[i][n-1]});
            visited[i][0] = visited[i][n-1] = true;
        }

        for(int i=1;i<n-1;i++){
            pq.offer(new int[]{0,i,h[0][i]});
            pq.offer(new int[]{m-1,i,h[m-1][i]});
            visited[0][i] = visited[m-1][i] = true;
        }


        int water = 0;
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!pq.isEmpty()){
            int[] curr = pq.poll();

            for(int[] num : dir){
                int r = curr[0] + num[0];
                int c = curr[1] + num[1];

                if(r<0 || c<0 || r>=m || c>=n || visited[r][c]) continue;

                visited[r][c] = true;
                water += Math.max(0,curr[2]-h[r][c]);

                pq.offer(new int[]{
    r,
    c,
    Math.max(curr[2], h[r][c])
});
            }
        }
        return water;
    }
}