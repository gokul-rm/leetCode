class Solution {
    public int longestWPI(int[] hours) {
        int n = hours.length;
        int max = 0;

        for(int i=0;i<n;i++){
            int len = 0;
            int count = 0;

            for(int j=i;j<n;j++){
                len++;
                if(hours[j] > 8) count++;
                else count--;

                if(count > 0) max = Math.max(max,len);
            }
        }
        return max;
    }
}