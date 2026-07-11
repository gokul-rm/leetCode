class Solution {
    public String toLowerCase(String s) {
      char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            int ascii=(int)c[i];
      
            if(ascii>64 && ascii<91){
               c[i]=(char)(ascii+32);
            }
        }
        return String.valueOf(c);  
    }
}