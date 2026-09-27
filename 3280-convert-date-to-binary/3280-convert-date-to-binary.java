class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();


        for(String s : date.split("-")){
            int num = Integer.parseInt(s);
            sb.append(Integer.toBinaryString(num));


            sb.append("-");
        }
        sb.setLength(sb.length()-1);
        
        return sb.toString();
    }
}