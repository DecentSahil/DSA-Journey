// Date:18-01-2026

class Solution {
    public int[] plusOne(int[] digits) {
        
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]!=9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;            
        }
        int[] newDigits = new int[digits.length+1];
        newDigits[0]=1;
        return newDigits;
    }  
}


//first attempt solution
/*
class Solution {
    public int[] plusOne(int[] digits) {
        
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]==9){
                digits[i]=0;
                continue;
            }
            if(digits[i]!=9){
                digits[i]++;
                break;
            }
        }
        if(digits[0]==0){
            int[] newDigits = new int[digits.length+1];
            newDigits[0]=1;
            for(int i=0; i<digits.length; i++){
                newDigits[i+1]=digits[i];
            }
            return newDigits;
        }
        return digits;
    }
}*/