// Date :18-01-2026
class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        int index =nums.length-1;
        while(left<=right){
            int lp = nums[left]*nums[left];
            int rp = nums[right]*nums[right];
            if(lp<rp){
                ans[index--]=rp;
                right--;
            }else{
                ans[index--] = lp;
                left++;
            }
        }
        return ans;
    }
}