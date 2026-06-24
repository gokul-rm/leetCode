class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int n=hours.length;
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(hours[i]>=target)
            k++;
        }
        return k;
    }
}