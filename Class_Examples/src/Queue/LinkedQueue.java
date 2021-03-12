package Queue;

class LinkedQueue
{
    private class Node
    {
        String element;
        Node next;
        Node(String e, Node n)
        {
            element = e; next = n;
        }
    }
    Node front = null;     // head of list, where items are removed
    Node rear = null;      // last node in list, where items are added

    public void enqueue(String s)
    {
        if(rear != null)
        {
            rear.next = new Node(s, null);
            rear = rear.next;
        }
        else
        {
            rear =  new Node(s, null);
            front = rear;
        }
    }

    boolean empty()
    {
        return front == null;
    }

    public String dequeue()
    {
        if(empty())
            throw new IllegalStateException();
        else
        {
            String value = front.element;
            front = front.next;
            if(front == null)
                rear = null;
            return value;
        }
    }
}
