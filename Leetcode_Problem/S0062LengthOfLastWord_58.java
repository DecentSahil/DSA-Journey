// Date:15-02-2026
class Solution {
    public int lengthOfLastWord(String s) {
        int j=0;
        s=s.trim(); 
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==' '){
                break;
            }
            j++;
        }
        return  j;
    }
}