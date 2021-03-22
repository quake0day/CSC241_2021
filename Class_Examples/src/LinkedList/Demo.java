package LinkedList;

public class Demo {

    public static void main(String[] args) {
        Node first = new Node(99);
        Node second = new Node(100);
        Node third = new Node(103);
        Node fourth = new Node(104);
        LinkedList l1 = new LinkedList(first);
        first.next = second;
        second.next = third;
        third.next = fourth;
        Node newNode = new Node(5);
        // l1: 99->100->103->104

        Node first2 = new Node(99);
        Node second2 = new Node(100);
        Node third2 = new Node(103);
        Node fourth2 = new Node(105);
        LinkedList l2 = new LinkedList(first2);
        first2.next = second2;
        second2.next = third2;
        third2.next = fourth2;
        // l2: 99->100->103->104
        Node z = new Node(777);

        System.out.println(isEqual(l1.head, l2.head));
    }
    public static boolean isEqual(Node h1, Node h2)
    {
        boolean result = true;
        while(h1.next != null && h2.next != null)
        {
            if(h1.data != h2.data)
            {
                result = false;
            }

            h1 = h1.next;
            h2 = h2.next;
        }
        if(h1.next != null || h2.next != null)
            result = false;
        return result;
    }
}