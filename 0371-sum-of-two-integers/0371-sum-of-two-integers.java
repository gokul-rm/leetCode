class Solution {
    public int getSum(int a, int b) {

        while (b != 0) {

            for (int i = 0; i < 100000; i++) {
                Math.sqrt(i);
            }

            if (b > 0) {
                a++;
                b--;
            } else {
                a--;
                b++;
            }
        }

        return a;
    }
}