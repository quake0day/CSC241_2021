package LinkedList;

public class Demo {

    public static void main(String[] args) {
        //
        Node first = new Node(99);
        Node second = new Node(100);
        Node third = new Node(103);
        Node fourth = new Node(104);
        LinkedList l = new LinkedList(first);
        System.out.println(l.isEmpty());
        first.next = second;
        second.next = third;
        third.next = fourth;

        Node nodeNew = new Node(102);
        second.next = nodeNew;
        nodeNew.next = third;

        // removing a node
        // if it is not the head node (e.g. nodeNew)
        second.next = nodeNew.next;

        // Time complexity? O(n)
        Node ref = l.head;
        while(ref != null)
        {
            System.out.print(ref.data + "->");
            ref = ref.next;

        }
        System.out.println();
        System.out.println("Size:");
        System.out.println(l.size());

        // add new Node 100 (n) to the end of the list
         Node n = new Node(999);
//        Node ref2 = l.head;
//        while(ref2.next != null)
//        {
//            ref2 = ref2.next;
//        }
//        ref2.next = n;
        l.addEnd(n);
        System.out.println(l);

    }
}