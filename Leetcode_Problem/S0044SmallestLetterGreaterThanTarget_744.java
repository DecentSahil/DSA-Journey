// Date:31-01-2026
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int smallest = -1;
        int left =0;
        int right = letters.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(letters[mid]>target){
                smallest = mid;
                right = mid-1;
            }else{
                left = mid+1;
                smallest = mid+1;
            }
        }
        if(smallest<0 || smallest>letters.length-1){
            return letters[0];
        }
        return letters[smallest];
    }
}