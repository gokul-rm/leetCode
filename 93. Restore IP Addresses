class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        trackIp(s, 0, new ArrayList<>(), res);
        return res;
    }

    private void trackIp(String s, int start, List<String> path, List<String> res) {
        if (path.size() == 4) {
            if (start == s.length()) {
                res.add(String.join(".", path));
            }
            return;
        }

        for (int i = 1; i < 4; i++) {
            // stops overflow
            if (start + i > s.length()) break;

            String part = s.substring(start, start + i);

            if (isValid(part)) {
                path.add(part);
                trackIp(s, start + i, path, res);
                path.remove(path.size() - 1);
            }
        }
    }

    private boolean isValid(String part) {
        // check starting zero
        if (part.length() > 1 && part.startsWith("0")) return false;
        // checking range(0-255)
        int num = Integer.parseInt(part);
        return num >= 0 && num <= 255;
    }
}
