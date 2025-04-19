class Solution {
    public long countGood(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        long totalPairs = 0;
        long ans = 0;

        for (int right = 0; right < nums.length; right++) {
            int count = map.getOrDefault(nums[right], 0);
            totalPairs += count;
            map.put(nums[right], count + 1);

            while (totalPairs >= k) {
                ans += nums.length - right;
                int leftCount = map.get(nums[left]);
                totalPairs -= leftCount - 1;
                if (leftCount == 1) {
                    map.remove(nums[left]);
                } else {
                    map.put(nums[left], leftCount - 1);
                }
                left++;
            }
        }

        return ans;
    }
}
