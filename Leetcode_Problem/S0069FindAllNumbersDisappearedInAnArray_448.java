// Date: 22-02-2026
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> list = new HashSet(nums.length);
        Set<Integer> list1 = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }
        for(int i=0; i<nums.length; i++){
            if(!list.contains(i+1)){
                list1.add(i+1);
            }
        }
        List<Integer> result = new ArrayList<>(list1);
        return result;
    }
}