package com.company;

//import org.w3c.dom.Node;

public class findMiddleNode {

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
        ListNode new_node = new ListNode(5);
        new_node.data = new_data;
        new_node.next = (head_ref);
        (head_ref) = new_node;
        return head_ref;
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
        findMiddleNode llist = new findMiddleNode();
        int middleNode = 0;
        for (ListNode temp = head; temp != null; temp = temp.next) {
            middleNode = (llist.findTheMiddleNode(head)).data;
        }
        System.out.println(middleNode);
    }
}
