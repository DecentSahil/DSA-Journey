// Date: 04-02-2026
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode prev = null;
        ListNode curr = head,slow = head,fast=head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        while(curr!=slow){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        while(prev!=null && slow!=null ){
            if(fast!=null){
                slow=slow.next;
                fast= fast.next;
            }
            if(slow.val!=prev.val){
                return false;
            }
            slow = slow.next;
            prev = prev.next;
        }
        return true;

    }
}