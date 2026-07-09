class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();

        for(int num : friends){
            set.add(num);
        }
        int idx = 0;

        for(int num : order){
            if(set.contains(num))friends[idx++] = num;
        }
        return friends;
    }
}