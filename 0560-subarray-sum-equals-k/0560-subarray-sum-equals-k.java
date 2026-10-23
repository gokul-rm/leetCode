class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();


        int count = 0;
        int pSum = 0;
        map.put(0,1);


        for(int num : nums){
            pSum += num;

            if(map.containsKey(pSum - k)){
                count += map.get(pSum - k);
            }

            map.put(pSum, map.getOrDefault(pSum,0)+1);
        }
        return count;
    }
}