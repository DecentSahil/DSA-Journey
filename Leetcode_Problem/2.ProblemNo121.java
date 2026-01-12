// Date:-12-01-2026
class Solution {
    public int maxProfit(int[] arr) {
        int maxProfit =0;
        int min =arr[0];
        for(int i=1; i<arr.length; i++){
            int profit = arr[i]-min;
            if(profit>maxProfit){
                maxProfit = profit;
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return maxProfit;
        
    }
}

//first attempt solution
//class Solution {
//     public int maxProfit(int[] arr) {
//         int maxProfit =0;
//         int currentProfit = 0;
//         int min =arr[0];
//         for(int i=1; i<arr.length; i++){
//             if(arr[i]>min){
//                 currentProfit = arr[i]-min;
//                 if(currentProfit>maxProfit){
//                     maxProfit = currentProfit;
//                 }
//             }
//             if(arr[i]<min){
//                 min = arr[i];
//             }
//         }
//         return maxProfit;
        
//     }
// }