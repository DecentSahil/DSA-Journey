// Date : 12-02-2026
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode s1 = l1;
        ListNode s2 = l2;
        ListNode s3 = new ListNode();
        ListNode output = s3;
        int remainder = 0;
        while (l1 != null && l2 != null) {
            int result = l1.val + l2.val + remainder;
            remainder = 0;
            if (result > 9) {
                remainder = result / 10;
                result %= 10;
            }
            ListNode newNode = new ListNode(result);
            s3.next = newNode;
            s3 = newNode;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int result = l1.val + remainder;
            remainder = 0;
            if (result > 9) {
                remainder = result / 10;
                result %= 10;
            }
            ListNode newNode = new ListNode(result);
            s3.next = newNode;
            s3 = newNode;
            l1 = l1.next;
        }
        while (l2 != null) {
            int result = l2.val + remainder;
            remainder = 0;
            if (result > 9) {
                remainder = result / 10;
                result %= 10;
            }
            ListNode newNode = new ListNode(result);
            s3.next = newNode;
            s3 = newNode;
            l2 = l2.next;
        }
        if(remainder!=0){
            ListNode node = new ListNode(remainder);
            s3.next = node;
            s3 = s3.next;
        }
        return output.next;
    }
}