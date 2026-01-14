// Date:14-01-2026 Time: 23:01
class Solution {
    public int countGoodSubstrings(String s) {
        
        int sLen = s.length();
        if (sLen < 3) return 0;
        char[] sArr = s.toCharArray();
        int res = 0;
        for (int i = 0; i < sLen - 2; i++) {
            if (sArr[i] != sArr[i + 1] && sArr[i] != sArr[i + 2] && sArr[i + 1] != sArr[i + 2]) {
                res++;
            }
        }
        
        return res;
    }
}

// class Solution {
//     public int countGoodSubstrings(String s) {
//         int n = s.length();
//         if(n<3) return 0;
//         int count = 0;
//         for(int i=0; i<n-2; i++){
//             if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i+1)!=s.charAt(i+2) && s.charAt(i)!=s.charAt(i+2)) count++;
//         }
//         return count;
//     }
// }