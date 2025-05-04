class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int[100]; 
        int pairs = 0;

        for (int[] d : dominoes) {
            int a = d[0], b = d[1];
            int key = a * 10 + b;
            if (a > b) key = b * 10 + a;
            pairs += count[key]++;
        }

        return pairs;
    }
}
