// Date : 21-01-2026 Time:00:41
class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left +(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[left]<=arr[mid]){
                if(target<arr[mid] && target>=arr[left]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            } else{
                if(target>arr[mid] && target<=arr[right]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}