class Solution {
    static final long mod = 1000000007;
    public int countGoodNumbers(long length) {
        long evenPos = (length + 1) / 2;
        long oddPos = (length) / 2;
        long evenWays = powLen(5 , evenPos);
        long oddWays = powLen(4,oddPos);
        
        return (int) ((evenWays * oddWays) % mod);
    }

    long powLen(long base , long power) {
        long result = 1;
        base %= mod;

        while(power > 0){
            if(power % 2 == 1){
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            power /= 2;
        }
        return result;
    }
}
