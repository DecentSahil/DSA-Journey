// Date:18-01-2026
class Solution {
    public int missingNumber(int[] nums) {
        int actualSum = 0;
        int totalSum = 0;
        for(int i=0; i<nums.length; i++){
            actualSum+=nums[i];
            totalSum+=i+1;
        }
        if (totalSum>=actualSum){
            return totalSum-actualSum;
        }
        return nums.length;
        
    }
}