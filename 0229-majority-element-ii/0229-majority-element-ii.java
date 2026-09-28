class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list  = new ArrayList<>();
        int max = 0;
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            if(map.containsKey(num)){
                max = Math.max(map.get(num),max);
            }
        }
        for(int num : nums){
            if(map.containsKey(num) && map.get(num) > nums.length/3){ list.add(num);
            map.remove(num);}
        }
        if(max == 1 && nums.length > 2) return new ArrayList<>();
        return list;
    }
}