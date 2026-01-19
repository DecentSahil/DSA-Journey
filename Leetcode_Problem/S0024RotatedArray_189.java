// Date : 19-01-2026
class Solution {
    public void rotate(int[] nums, int k) {
        int n =nums.length;
        k=k%n;
        int right = n-1; 
        reverse(0,n-1,nums);       
        reverse(0,k-1,nums);       
        reverse(k,n-1,nums);       
    }
    static void reverse(int left,int right,int[] nums){
        while(left<=right){
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }
}