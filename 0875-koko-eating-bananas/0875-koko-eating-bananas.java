class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;

        for(int num : piles){
            max = Math.max(num,max);
        }

        int left = 1;

        while(left < max){
            int mid = (left + max)/2;
            int sum = 0;
            for(int num : piles){
                sum += Math.ceil((double)num / mid);
            }
            if(sum <=h ) max = mid;
            else left = mid+1;        
        }
        return left;
    }
}