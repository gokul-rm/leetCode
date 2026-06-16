class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 0;

        for(int num : nums) set.add(num);

        for(int num : set){
            if(!set.contains(num-1)){
                int length = 1;
                int curr = num+1;
                
                while(set.contains(curr)){
                    curr++;
                    length++;
                }
                res = Math.max(res,length);
            }

        }
        return res;
    }
}