class Solution {
    public boolean uniformArray(int[] nums1) {
        
        int min = Integer.MAX_VALUE;    
        boolean isOdd = false;

        for(int num : nums1){
            if(num %2 != 0) isOdd = true;

            if(min > num) min = num;
        }

        if(min % 2 != 0) return true;
        if(!isOdd) return true;
        return false;

    }
}