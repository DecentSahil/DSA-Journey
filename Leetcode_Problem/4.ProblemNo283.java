Date:14-02-2026 Time: 00:24
class Solution {
    public void moveZeroes(int[] nums) {
        int end = nums.length-1;
        int start =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                end--;
                start++;
            }
        }       
    }
}