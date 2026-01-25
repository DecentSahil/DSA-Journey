// date:25-01-2026
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] bool = new boolean[nums.length];
        helper(nums, bool, new ArrayList<>(), list);
        return list;
    }

    static void helper(int[] nums, boolean[] used, ArrayList current, List<List<Integer>> list) {
        if (current.size() == nums.length) {
            list.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++){
            if (used[i])
                continue;
            used[i] = true;
            current.add(nums[i]);
            helper(nums,used,current,list);
            current.remove(current.size()-1);
            used[i]=false;
        }
    }
}