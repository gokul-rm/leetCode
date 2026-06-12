class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();
        int[] res = new int[nums1.length];

        for(int val : nums2){
            while (!stack.isEmpty() && stack.peek() < val)
                map.put(stack.pop(), val);
            stack.push(val);
        }

        for(int i=0; i<nums1.length;i++){
            res[i] = map.getOrDefault(nums1[i],-1);
        }
        return res;
    }
}