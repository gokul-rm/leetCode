class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] dou = new int[2];
        int[] res = new int[101];
        int idx = 0;
        
        for (int num : nums) {
            res[num]++;
        }
        
        for (int i = 0; i < res.length; i++) {
            if (res[i] == 2) {
                dou[idx++] = i;
                if (idx == 2) break;
            }
        }
        return dou;
    }
}
