class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] maxn = new int[n];
        maxn[n-1] = nums[n-1] ;
        for (int i = n-2; i >= 0; i--)
            maxn[i] = Math.min(nums[i], maxn[i+1]);
        int mxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mxi = Math.max(mxi, nums[i]) ;
            if (mxi - maxn[i] <= k) return i;
        }
        return -1;
    }
}