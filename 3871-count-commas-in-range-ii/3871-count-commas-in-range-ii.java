class Solution {
    public long countCommas(long n) {
        int res = 0;
        if(n<1000) return 0;

        long temp = 1000;
        long total = 0;

        while(n >= temp){
            total += n-temp+1;
            
            temp *= 1000;
        
        }
        return total;

    }
}