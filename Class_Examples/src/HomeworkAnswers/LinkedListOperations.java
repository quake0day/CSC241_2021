package HomeworkAnswers;

public class LinkedListOperations {
    public static void main(String[] args) {

        int[] nodeValue = {5, 6, 7, 1, 10, 20};
        MyLinkedList l = new MyLinkedList();
        l.head = new Node(nodeValue[0]);
        Node first = l.head;
        for(int i = 1; i < nodeValue.length; i++)
        {
            Node newNode = new Node(nodeValue[i]);
            first.next = newNode;
            first = first.next;
        }
        System.out.println(gretaerThan(l,6));
        // input 2
        int[] nodeValue2 = {97,99,7,1,10,20};
        MyLinkedList l2 = new MyLinkedList();
        l2.head = new Node(nodeValue2[0]);
        Node first2 = l2.head;
        for(int i = 1; i < nodeValue2.length; i++)
        {
            Node newNode = new Node(nodeValue2[i]);
            first2.next = newNode;
            first2 = first2.next;
        }
        System.out.println(gretaerThan(l2,20));

    }
    public static MyLinkedList gretaerThan(MyLinkedList l, int i)
    {
        Node dummy = new Node(-1);
        Node returnHead = dummy;
        Node head = l.head;
        while(head != null)
        {
            if(head.data > i)
            {
                Node nNode = new Node(head.data);
                dummy.next = nNode;
                dummy = dummy.next;
            }
            head = head.next;
        }
        MyLinkedList result = new MyLinkedList();
        result.head = returnHead.next;
        return result;
    }
}
