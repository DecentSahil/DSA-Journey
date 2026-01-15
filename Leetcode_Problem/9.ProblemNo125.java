// Date: 15-01-2026 Time:-22:44
class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        char[] strArray = str.toCharArray();
        int right = strArray.length-1;
        int left =0;
        while(left<right){
            if(strArray[left]!=strArray[right]){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}