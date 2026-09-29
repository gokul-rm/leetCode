class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int res = 0;

        int i=0;
        int j = people.length-1;

        while(i<=j){
            if(people[i]+people[j] <= limit){
                res++;
                i++;
                j--;
            } else if(people[j] <= limit){ j--; res++;}
        }
        return res;
    }
}