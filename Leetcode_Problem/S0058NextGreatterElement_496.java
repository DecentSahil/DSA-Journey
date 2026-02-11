// Date: 11-02-2026
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            int nextGreater =-1;
            for(int j =nums2.length-1; j>=0; j--){
                if(nums1[i]==nums2[j]){
                    break;
                }
                if(nums2[j]>nums1[i]){
                    nextGreater = nums2[j];
                }
            }
            arr[i] = nextGreater;
        }
        return arr;
    }
}