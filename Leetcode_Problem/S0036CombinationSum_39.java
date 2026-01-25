// Date: 25-01-2026
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        helper(0,0,candidates,target,new ArrayList<>(),result);
        return result;
    }
    static void helper(int index,int sum,int[] candidates,int target,ArrayList current,List<List<Integer>> result){
        if(sum==target){
            result.add(new ArrayList<>(current));
            return;
        }
        else if(sum>target){
            return;
        }
        for(int i=index; i<candidates.length; i++){
            current.add(candidates[i]);
            sum+=candidates[i];
            helper(i,sum,candidates,target,current,result);
            current.remove(current.size()-1);
            sum-=candidates[i];
        }
    }
}