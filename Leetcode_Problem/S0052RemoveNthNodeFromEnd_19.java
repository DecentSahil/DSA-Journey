// Date:04-02-2026
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int count = 0;
        while(curr!=null){
            count++;
            curr= curr.next;
        }
        int pos = count-n;
        if(pos==0){
            head = head.next;
            return head;
        }
        count =1;
        curr =head;
        while (curr!=null && curr.next!=null){
            if(pos == count){
                curr.next = curr.next.next;
                count++;
                break;
            }
            count++;
            curr = curr.next;
        }
        return head;
    }
}