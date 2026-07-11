class Solution {
    public int earliestTime(int[][] tasks) {
        int sum = Integer.MAX_VALUE;
        for(int[] arr: tasks){
            sum = Math.min(sum,arr[0]+arr[1]);
        }
        return sum;
    }
}