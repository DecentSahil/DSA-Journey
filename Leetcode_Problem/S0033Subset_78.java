// Date: 23-01-2026
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list =  new ArrayList<>();
        return allpair(0,nums,new ArrayList<>(),list);
    }
    static List<List<Integer>> allpair(int index, int[] nums,ArrayList current,List<List<Integer>> list ){
        list.add(new ArrayList<>(current));
        for(int i=index; i<nums.length; i++){
            current.add(nums[i]);
            allpair(i+1,nums,current,list);
            current.remove(current.size()-1);
        }
        return list;
        
    }
}