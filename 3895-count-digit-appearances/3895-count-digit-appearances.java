class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int[] arr = new int[10];

        for(int num : nums){
            while(num > 0){
                arr[num%10]++;
                num/=10;
            }
        }
        return arr[digit];
    }
}