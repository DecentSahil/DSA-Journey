Date:23-01-2025
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list =  new ArrayList<>();
        helperFunction(1,n,k,list,new ArrayList<>());
        return list;
    }
    public static void helperFunction(int index,int total,int pairing,List<List<Integer>> list,List<Integer> current){
        if(current.size()==pairing){
            list.add(new ArrayList<>(current));
            return;
        }
        for(int i=index; i<=total; i++){
            current.add(i);
            helperFunction(i+1,total,pairing,list,current);
            current.remove(current.size()-1);
        }
    }
}