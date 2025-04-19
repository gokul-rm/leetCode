class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String preStr = countAndSay(n-1);
        StringBuilder temp = new StringBuilder();
        int i =0;

        while(i< preStr.length()){
            int count =1;
            while(i+1 < preStr.length() && preStr.charAt(i) == preStr.charAt(i+1)){
                i++;
                count ++;
            }
            temp.append(count).append(preStr.charAt(i));
            i++;
        }
        return temp.toString();
    }
}
