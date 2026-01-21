// Date : 21-01-2026
class Solution {
    public int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int first = 0;
        int second = 1;
        int sum = 0;
        for(int i=2; i<=n; i++){
            sum = first+second;
            first= second;
            second = sum;
        }
        return sum;
    }


    // Using recursion
    // public int fib(int n) {
    //     if(n==0){
    //         return 0;
    //     }
    //     if(n==1){
    //         return 1;
    //     }
    //     return fib(n-1)+fib(n-2);
    // }
}