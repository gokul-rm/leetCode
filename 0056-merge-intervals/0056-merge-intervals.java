class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);

        int[] currIdx = intervals[0];
        int curr = 1;

        while(curr < intervals.length){
            if(currIdx[1] >= intervals[curr][0]){
                currIdx[0] = Math.min(currIdx[0],intervals[curr][0]);
                currIdx[1] = Math.max(currIdx[1],intervals[curr][1]);
            }
            else{
                list.add(currIdx);
                currIdx = intervals[curr];    
            }
            curr++;
        }
        list.add(currIdx);
        return list.toArray(new int[0][]);
    }
}