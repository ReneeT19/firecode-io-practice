package com.company;
import java.io.*;
public class insertAtTail {

    public ListNode insertAtTail(ListNode head, int data) {

        ListNode newNode = new ListNode(data);

        if(head == null) {
            head = newNode;
        } else {
            ListNode last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return head;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
