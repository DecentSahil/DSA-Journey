// Date: 27-01-2026
class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        
        quickSort(heights,0,n-1);

    }
    static void quickSort(int[] heights,int low,int high){
        if(low<high){
            int pivotIndex = partition(heights,low,high);

            quickSort(heights,low,pivotIndex-1);
            quickSort(heights,pivotIndex+1,high);
        }
    }
    static int partition(int[] heights,int low,int high){
        int index = low;
        int pivot = arr[high];
        for(int i=low; i<high; i++){
            if(pivot>heights[i]){
                int temp = heights[index];
                heights[index++] = heights[high];
                heights[high] = temp;
            }
        }
        int temp = heights[index];
        heights[index] = heights[high];
        heights[high] = temp;
        return index;
    }
}