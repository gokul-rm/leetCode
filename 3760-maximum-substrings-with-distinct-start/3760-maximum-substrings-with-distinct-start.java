class Solution {
    public int maxDistinct(String s) {
         boolean[] letters = new boolean[26];
        int counter = 0;


        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i)-97;

            if (!letters[idx]) {
                letters[idx] = true;
                counter++;

                if (counter == 26) {
                    return 26;
                }
            }
        }

        return counter;
    }
}