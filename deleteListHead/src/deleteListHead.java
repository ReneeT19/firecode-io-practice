class deleteListHead {

     static class ListNode {
         int data;
         ListNode next;
     };

     static ListNode deleteAtHead(ListNode head) {
        if (head == null)
            return null;

        // Move the head pointer to the next node
        ListNode temp = head;
        head = head.next;

        return head;
    }

     static ListNode push(ListNode head_ref, int new_data)
     {
         ListNode new_node = new ListNode();
         new_node.data = new_data;
         new_node.next = (head_ref);
         (head_ref) = new_node;
         return head_ref;
     }

    public static void main(String args[]) {
        ListNode head = null;

        head = push(head, 12);
        head = push(head, 0);
        head = push(head, 11);
        head = push(head, 23);
        head = push(head, 1);

        head = deleteAtHead(head);
        for (ListNode temp = head; temp != null; temp = temp.next)
            System.out.print(temp.data + " ");
    }
 }
