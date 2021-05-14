package com.company;

public class insertAtHead {

    public ListNode addAtStart(ListNode head, int data) {

        ListNode newNode = new ListNode(data);

        if(head == null) {
            return newNode;
        } else {
            newNode.next = head;
        }
        return newNode;
    }

        public static void main(String[] args) {
	//the driver is not working
//        insertAtHead cl = new insertAtHead();
//        ListNode newNode = new ListNode(7);
//
//        //Adding 1 to the list
//        System.out.println(cl.addAtStart(newNode,1));
//        //Adding 2 to the list
//        cl.addAtStart(newNode,2);
    }
}
