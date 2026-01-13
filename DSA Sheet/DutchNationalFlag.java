class DutchNationalFlag {
    public static void main(String[] args) {

        int arr[] = {0,2,1,0,2,0,0,0,1,2,0,1,0,2,0,1,1,0};

        int start = 0;
        int mid = 0;
        int end = arr.length - 1;

        while (mid <= end) {

            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[start];
                arr[start] = temp;

                start++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else { // arr[mid] == 2
                int temp = arr[mid];
                arr[mid] = arr[end];
                arr[end] = temp;

                end--;
            }
        }
    }
}
