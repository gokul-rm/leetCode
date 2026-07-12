class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n= arr.length;
        int sort[] = new int[n];

        for(int i=0 ; i<n ; i++){
            sort[i] = arr[i];
        }
        Arrays.sort(sort);
        HashMap<Integer , Integer> map = new HashMap<>();
        int i=1;
        for(int ele : sort){
            if(!map.containsKey(ele)){
                map.put(ele , i++);
            }
        }
        for(int k=0 ; k<n ; k++){
            arr[k] = map.get(arr[k]);
        }
        return arr;
    }
}