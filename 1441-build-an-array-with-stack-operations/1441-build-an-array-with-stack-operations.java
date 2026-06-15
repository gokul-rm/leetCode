class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();

        int curr = 0;
        int targetVal = 1;

        while(curr < target.length){
            list.add("Push");
            if(target[curr] == targetVal) curr++;
            else{
                list.add("Pop");
            }
            targetVal++;
        }
        return list;
    }
}