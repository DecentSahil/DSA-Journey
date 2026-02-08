// Date:08-02-2026
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int start = 0;
        int swaptime = 0;
        // for(int i=start; i<students.length; i++){
        while(start<students.length){
            if(students[start] == sandwiches[start]){
                start++;
                swaptime =0;
                continue;
            }
            swaptime++;
            int first = students[start];
            for(int j = start; j<students.length-1; j++){
                students[j]= students[j+1];
            }
            students[students.length-1]=first;
            if(swaptime==students.length-start){
                return swaptime;
            }
        }
        return 0;

    }
}