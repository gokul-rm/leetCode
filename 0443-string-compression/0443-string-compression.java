class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        char prev = chars[0];
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (prev == chars[i]) {
                count++;
            } else {
                sb.append(prev);

                if (count > 1) {
                    sb.append(count);
                }

                prev = chars[i];
                count = 1;
            }
        }


        sb.append(prev);
        if (count > 1) {
            sb.append(count);
        }

        int idx = 0;
        for (char ch : sb.toString().toCharArray()) {
            chars[idx++] = ch;
        }

        return sb.length();
    }
}