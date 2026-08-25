class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            if(num % k == 0) set.add(num);
        }
        int a = 1;

        while(set.contains(k*a)){
            a++;
        }
        return a*k;
    }
}