public class Main {
    public static void main(String[] args) {
        //Declaration of array
        int[] array;
        int []array1;
        int [] array2;
        int array3[];
        //2-d array
        int[] []array4;
        int []array5[];
        int[][] array6;
        //3-d array
        int[] []array7[];
        int[] [][]array8;
        int []array9[][];
        int array10[][][];
        int[][][] array11;

        // Tricky Mixed Declarations
        int[] arr4[],arr5[]; // arr4 and arr5 are two dimensional
        int[] []arr6,arr7[]; // arr6 is two dimensional and arr7 is 3 dimensional
        int[] []arr8,arr9; // arr8 and arr9 are two dimensional

        //Creation of array(size should be specify at the time of creation)
        int arr[] = new int[5];
        int[] arr1 = new int[6];
        int arr2[] = new int[7];
        int arr3[][] = new int[7][];
//        int arr10[][] = new int[][7]; //invalid
        int arr11[][] = new int[7][];
//        int arr12[][][] = new int[][7][]; //invalid

        System.out.println("Length : "+arr.length);
        int a[] = {23,45,54,32,34,34,23342};
        System.out.println("Length : "+a.length);




    }
}