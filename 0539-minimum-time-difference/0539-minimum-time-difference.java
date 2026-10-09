class Solution {
    public int findMinDifference(List<String> list) {
        if(list.size() > 1440) return 0;
        int[] res = new int[list.size()];
        int n = 0;
        for(String s : list){
            String h = s.substring(0,2);
            String m = s.substring(3,5);
            int time = Integer.parseInt(h) * 60 + Integer.parseInt(m);
            res[n++] = time;
        }

        Arrays.sort(res);
        int min = Integer.MAX_VALUE;

        for(int i=1;i<list.size();i++){
            min = Math.min(res[i]-res[i-1],min);
        }
        int round = (1440 + res[0]) - res[n - 1];
        min = Math.min(min, round);
        return min;
    }
}