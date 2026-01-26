// Date:26-01-2026
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1=0,n2=0,n3=0;
        int[] nums = new int[m+n];
        while(n1<m && n2<n){
            if(nums1[n1]<nums2[n2]){
                nums[n3++]=nums1[n1++];
            }else{
                nums[n3++]=nums2[n2++];
            }
        }
        while(n1<m){
            nums[n3++] = nums1[n1++];
        }
        while(n2<n){
            nums[n3++] = nums2[n2++];
        }
        for(int i=0; i<n3; i++){
            nums1[i]=nums[i];
        }
        
    }
}