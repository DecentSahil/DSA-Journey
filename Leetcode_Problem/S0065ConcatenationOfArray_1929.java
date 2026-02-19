// Date:19-02-2026
class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>(Collection.toList(nums));
        list.addAll(list);
        return list.toArray();
    }
}