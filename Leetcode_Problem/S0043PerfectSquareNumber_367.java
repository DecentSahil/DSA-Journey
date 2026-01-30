// Date 30-01-2026
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==0){
            return false;
        }
        int left = 1;
        int right = num;

        while(left<=right){
            int mid =left+(right-left)/2;
            if(mid*mid==num){
                return true;
            }else if(mid<=num/mid){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return false;
    }
}