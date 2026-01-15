// Date: 15-01-2026
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int end = nums.length-1;
        int start = 0;
        int uniqueElement = 0;
        while(start<end){
            if(nums[start]!=nums[start+1]){
                nums[uniqueElement++]=nums[start];
            }
            start++;
        }
        nums[uniqueElement++]=nums[start];
        return uniqueElement;
    }
}