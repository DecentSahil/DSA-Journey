// Date: 30-01-2026
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n<=1){
            return 1;
        }
        int left = 0;
        int right = n;
        int ans = n;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(isBadVersion(mid)){
                ans = mid;
                right=mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return ans;
        
    }
}