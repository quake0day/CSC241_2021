package HomeworkAnswers;

public class ConcatenateTwoLinkedList {

        public static void main(String[] args)
        {
            MyLinkedList l1 =  new MyLinkedList();
            l1.head = new Node(2);
            l1.head.next = new Node(3);
            l1.head.next.next = new Node(1);

            MyLinkedList l2 = new MyLinkedList();
            l2.head = new Node(4);
            l2.head.next = new Node(5);

            concatenate(l1.head, l2.head);

            Node temp = l1.head;
            while(temp != null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }

        }



        public static void concatenate(Node l1, Node l2)
        {
            //
            // Precondition: l1 and l2 are head reference of linked lists.
            // Both lists are not empty
            //
            // Postcondition: A copy of list l2 is concatenated (added to the end)
            // of list l1.  List l2 should be unchanged by the function.
            // NOTE: The nodes added to the list l1 must be copies of the
            // nodes in list l2.

            Node temp = l1;
            while(temp.next != null)
            {
                temp = temp.next;
            }

            Node temp2 = l2;
            while(temp2 != null)
            {
                Node newNode = new Node(temp2.data);
                temp.next = newNode;
                temp2 = temp2.next;
                temp = temp.next;
            }


        }

}
