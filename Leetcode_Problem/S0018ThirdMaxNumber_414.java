// Date : 18-01-2026
class Solution {
    public int thirdMax(int[] nums) {
        Long first = Long.MIN_VALUE;
        Long second = Long.MIN_VALUE;
        Long third = Long.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            long current = nums[i];
            if(current == first || current  == second || current == third){
                continue;
            }
            if(current>first){
                third = second;
                second = first;
                first = current;
            }
            else if(current>second){
                third = second;
                second = current;
            }else if(current>third){
                third = current;
            }
        }

        return third==Long.MIN_VALUE ? first.intValue() : third.intValue();
        
    }
}