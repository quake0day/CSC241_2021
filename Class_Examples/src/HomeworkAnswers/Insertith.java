package HomeworkAnswers;
import java.util.*;

public class Insertith {

        public static void main(String[] args)
        {
            // Please write your own test data.
            MyLinkedList l1 =  new MyLinkedList();

            /* this program has 0 based indexing */

            // if list is empty, insert at head
            insertith(l1.head, 3, 12);

            l1.head = new Node(2);
            l1.head.next = new Node(3);
            l1.head.next.next = new Node(4);
            l1.head.next.next.next = new Node(5);
            l1.head.next.next.next.next = new Node(6);

            // insert at position 2
            insertith(l1.head, 99999, 2);
            // insert at the beginning
            insertith(l1.head, 111111, 0);
            // insert at position 1
            insertith(l1.head, 22222, 1);
            // insert at position 4
            insertith(l1.head, 4444444, 4);
            // index is greater than length of list, insert at end
            insertith(l1.head, 8888, 88);
            // insert at the beginning
            insertith(l1.head, 516, 0);
        }

        public static void insertith(Node head, int value, int i)
        {
            //
            // Precondition: head is the head reference of a linked list.
            // The list may be empty or non-empty.
            //
            // Postcondition: The number value is inserted as the ith member
            // of the list head.  If the list head has fewer than i-1 nodes
            // in it, then value is inserted as the last node in the list.


            Node current = head;
            Node newNode = new Node(value);
            // If the list is empty
            if (head == null){
                head = newNode;
            }
            else if (i == 0) { // if i = 0
                newNode.next = head;
                head = newNode;
                current = head;
            }
            else {
                int count = 0;
                while (current.next != null) {
                    current = current.next;
                    count++;
                }
                count += 1;
                if (i > count) { // if i > length of linkedlist
                    current.next = newNode;
                }
                else {
                    current = head;
                    for (int j = 0; j < i - 1; j++) {
                        current = current.next;
                    }
                    newNode.next = current.next;
                    current.next = newNode;
                }
            }

        }

}
