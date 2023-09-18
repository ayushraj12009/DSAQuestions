package LinkedList;

import java.util.List;

class ListNode{
    int val;
    ListNode next;

  public ListNode(int val){
      this.val = val;
  }
}
public class reverselinkedlist {

    public static ListNode reverseList(ListNode a){
        ListNode prev = null;
        ListNode curr = a;

        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
    public static void printlist(ListNode a){
        ListNode head = a;
        while(head!=null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(5);
        ListNode b = new ListNode(10);
        ListNode c = new ListNode(15);
        ListNode d = new ListNode(20);
        ListNode e = new ListNode(25);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.print("Original List");
        System.out.println();
        printlist(a);

        System.out.println();

        ListNode reverseTheList = reverseList(a);
        printlist(reverseTheList);





    }
}
