// Date: 09-02-2026
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

// Using queue method
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> student = new LinkedList<>();
        Queue<Integer> sandwich = new LinkedList<>();
        for (int i = 0; i < students.length; i++) {
            student.add(students[i]);
            sandwich.add(sandwiches[i]);
        }
        while (!sandwich.isEmpty()) {
            if (student.peek().equals(sandwich.peek())) {
                student.poll();
                sandwich.poll();
                continue;
            }
            Iterator<Integer> it = student.iterator();
            while (it.hasNext()) {
                if (it.next().equals(sandwich.peek())) {
                    sandwich.poll();
                    it.remove();
                    break;
                }
                if (!it.hasNext()) {
                    return student.size();
                }
            }
        }
        return student.size();
    }
}