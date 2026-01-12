

class KadaneAlgorithm {
    public static void main(String[] args) {
        int arr[] ={12,4,1,-16,4,3,-23,2,1};
        System.out.println("MaxSum : "+maxSum(arr));
    }
    
    static int maxSum(int arr[]){
        int start = 0,end =0,tempStart = 0;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int index = 0; index<arr.length; index++){
            currentSum +=arr[index];
            if(currentSum>maxSum){
                maxSum = currentSum;
                start = tempStart;
                end = index;
            }
            if(currentSum<0){
                currentSum = 0;
                tempStart =index+1;
            }
            
        }
        System.out.println("Starting Index : "+start); //Starting index of maxSum
        System.out.println("Ending Index : "+end); //ending index of maxSum
        return maxSum;
    }
}