// Date: 16-02-2026
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length<2){
            return new int[]{1};
        }
        int[] result = new int[nums.length];
        result[result.length-1] = 1;
        for(int i=result.length-2; i>=0; i--){
            result[i] = result[i+1]*nums[i+1];
        }
        int suffix = 1;
        for(int i=0; i<result.length; i++){
            result[i] = result[i]*suffix;
            suffix*=nums[i];
        }
        return result;
    }
}