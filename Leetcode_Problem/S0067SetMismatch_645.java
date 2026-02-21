// Date: 21-02-2026
class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);

        int duplicate = -1;
        int value = -1;
        for (int i = 0; i < nums.length ; i++) {
            if(!set.add(nums[i])){
                duplicate = nums[i];
            }
        }
        for (int i = 0; i < nums.length ; i++) {
            if(!set.contains(i+1)){
                value = i+1;
            }
        }
        return new int[] { duplicate, value };
    }
}