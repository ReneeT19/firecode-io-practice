package com.company;

//import org.w3c.dom.Node;

public class findMiddleNode {
//return the second one when the number is even
    public ListNode findTheMiddleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        if (head == null) {
            return null;
        } else {
            while (fast != null && fast.next != null) {
                fast = (fast.next).next;
                slow = slow.next;
            }

        }
        return slow;
    }

    static ListNode push(ListNode head_ref, int new_data)
    {
        ListNode new_node = new ListNode(6);
        new_node.data = new_data;
        new_node.next = (head_ref);
        (head_ref) = new_node;
        return head_ref;
    }

    //return the first one when the number is even
    public ListNode findTheMiddleNode2(ListNode head) {
        if (head == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null && (fast.next).next != null) {
            fast = (fast.next).next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        // write your code here
        ListNode head = null;

        // Use push() function to con
        // the below list 8 . 23 . 11 . 29 . 12 /
        head = push(head, 12);
        head = push(head, 29);
        head = push(head, 11);
        head = push(head, 23);
        head = push(head, 8);
        head = push(head, 2);
        findMiddleNode llist = new findMiddleNode();
        int middleNode = 0;
        int middleNode2 = 0;
        for (ListNode temp = head; temp != null; temp = temp.next) {
            middleNode = (llist.findTheMiddleNode(head)).data;
            middleNode2 = (llist.findTheMiddleNode2(head)).data;
        }
        System.out.println(middleNode);
        System.out.println(middleNode2);
    }
}
