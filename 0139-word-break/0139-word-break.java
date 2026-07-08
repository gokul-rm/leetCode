class Solution {

    HashMap<String, Boolean> map = new HashMap<>();

    public boolean wordBreak(String s, List<String> wordDict) {

        if (s.length() == 0) return true;

        if (map.containsKey(s)) {
            return map.get(s);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            sb.append(s.charAt(i));

            if (wordDict.contains(sb.toString())) {

                String remaining = s.substring(i + 1);

                if (wordBreak(remaining, wordDict)) {

                    map.put(s, true);

                    return true;
                }
            }
        }

        map.put(s, false);

        return false;
    }
}