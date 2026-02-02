// Date:02-02-2026
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstPosition =-1;
        int secondPosition = -1;
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                firstPosition = mid;
                right = mid-1;
           }else if(nums[mid]>target){
                right = mid-1;
           }else{
                left = mid+1;
           }
        }
        if(firstPosition==-1){
            return new int[]{-1,-1};
        }
        left =0;
        right = nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                secondPosition = mid;
                left = mid+1;
           }else if(nums[mid]>target){
                right = mid-1;
           }else{
                left = mid+1;
           }
        }
        return new int[]{firstPosition,secondPosition};
        
   }
}