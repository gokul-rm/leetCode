class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        
        for (String s : title.split(" ")) {
            if (s.length() < 3) {
                sb.append(s.toLowerCase());
            } else {
                sb.append(Character.toUpperCase(s.charAt(0)));
                sb.append(s.substring(1).toLowerCase());
            }
            sb.append(" ");
        }
        
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}