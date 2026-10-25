class Solution {
    int m,n;
    public int closedIsland(int[][] grid) {
         m = grid.length;
         n = grid[0].length;
        int count=0;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==0)
                {
                    if(dfs(grid,i,j))
                        count++;
                }
            }
        }
        return count;
    }
    private boolean dfs(int[][]grid, int row, int col)
    {
        if(row<0 || col<0 || row>=m|| col>=n)
            return false;

        if(grid[row][col]==1)
            return true;
        
        
        grid[row][col] = 1;

        boolean up = dfs(grid,row-1,col);
        boolean down = dfs(grid,row+1,col);
        boolean left = dfs(grid,row,col-1);
        boolean right = dfs(grid,row,col+1);

        return up && down && left && right;
    }
}