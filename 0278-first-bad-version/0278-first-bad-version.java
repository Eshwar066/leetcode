/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=0,r=n;
        int res=-1,mid=0;
        while(n>0 && l<=r){
            mid=l+(r-l)/2;
            if(isBadVersion(mid)){
                r=mid-1;
                res=mid;
            
            }else{
                l=mid+1;
            }
        }
        return res;
    }
}