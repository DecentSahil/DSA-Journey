// Date:10-02-2026
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right =0;
        for(int pile:piles){
            right = Math.max(pile,right);
        }
        int result = 0;
        while(left<=right){
            int mid = left +(right-left)/2;
            if(canEat(mid,h,piles)){
                result = mid;
                right = mid-1;
            }else{
                left =mid+1;
            }
        }
        return result;
    }
    static boolean canEat(int banana,int hour,int[] piles){
        int time =0;
        for(int i=0; i<piles.length; i++){
            time += (piles[i] + banana - 1) / banana;
            if(time>hour){
                return false;
            }
        }
        return true;
    }
}