package LinkedList;

import java.util.List;

public class middleOfTheLinkedList {
    public static ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(20);
        ListNode b = new ListNode(50);
        ListNode c = new ListNode(252);
        ListNode d = new ListNode(5421);
        ListNode e = new ListNode(71);
       // ListNode f = new ListNode(9);

        head.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
      //  e.next = f;

        ListNode ans = middleNode(head);
        System.out.println(ans.val);

    }
}
