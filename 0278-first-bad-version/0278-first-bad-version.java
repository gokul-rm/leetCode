/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int res = 0;
        int left = 1;
        int right = n;

        while(left <= right){
            int mid  = left + (right - left) / 2;

            if(isBadVersion(mid)){
                res = mid;
                right = --mid;
            }
            else{
                left = mid + 1;
            }
        }
        return res;
    }
}