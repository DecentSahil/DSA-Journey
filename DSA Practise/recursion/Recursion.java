// Date: 21-01-2026
class Recursion {
    public static void main(String[] args) {

        System.out.println(isPalindrome("12321", 0, 4));

        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        fib(6, 0, 1);
    }

    static void fib(int n, int a, int b) {
        if (n == 0) return;
        System.out.print(a + " ");
        fib(n - 1, b, a + b);
    }

    static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) return true;
        if (str.charAt(left) != str.charAt(right)) return false;
        return isPalindrome(str, left + 1, right - 1);
    }

    static void reverseArray(int arr[], int left, int right) {
        if (left >= right) return;

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseArray(arr, left + 1, right - 1);
    }
}
