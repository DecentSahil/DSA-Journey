// Date: 14-02-2026
class Solution {
    public String intToRoman(int num) {
        String[] M ={"","M","MM","MMM"}; 
        String[] C ={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"}; 
        String[] X ={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"}; 
        String[] I ={"","I","II","III","IV","V","VI","VII","VIII","IX"}; 
        
        return M[num/1000]+C[(num%1000)/100]+X[(num%100)/10]+I[(num%10)];
    }
}
// StringBuilder sb = new StringBuilder();

// int index = num/1000;
// sb.append(M[index]);
// num%=1000;
// index = num/100;
// sb.append(C[index]);
// num%=100;
// index = num/10;
// sb.append(X[index]);
// num%=10;
// sb.append(I[num]);
// return sb.toString();