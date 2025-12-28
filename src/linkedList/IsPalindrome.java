package linkedList;

public class IsPalindrome {
    ListNode left;
    
    public boolean isPalindrome(ListNode head) {
        left = head;
        return check(head);
    }

    private boolean check(ListNode right) {
        if (right == null)
            return true;
        if (!check(right.next))
            return false;
        boolean same = (left.val == right.val);

        left = left.next;
        
        return same;
    }
}
