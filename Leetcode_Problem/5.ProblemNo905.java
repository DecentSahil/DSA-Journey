// Date: 14-01-2026 Time: 21:19

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start =0;
        int end = nums.length;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                int temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
                start++;
            }
        }
        return nums;
    }
}