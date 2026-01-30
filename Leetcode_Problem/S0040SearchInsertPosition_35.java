// Date: 30-01-2026
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int position =1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                position = mid;
                right = mid-1;
            }else{
                position = mid+1;
                left = mid+1;
            }
        }
        return position;
    }
}