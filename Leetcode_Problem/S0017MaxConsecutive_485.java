// Date :17-01-2026
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutive = 0;
        int current = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                current++;
                if(current>maxConsecutive){
                    maxConsecutive = current;
                }
            }else{
                current = 0;
            }
        }
        return maxConsecutive;
    }
}