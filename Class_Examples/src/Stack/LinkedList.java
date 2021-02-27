package Stack;

public class LinkedList
{
    Node head;
    LinkedList(Node h){this.head = h;}

    public boolean isEmpty(){return this.head == null;}

    public int size()
    {
        int count = 0;
        Node p = head;

        while(p != null)
        {
            count++;
            p = p.next;
        }
        return count;
    }

    public String toString()
    {
        Node ref = head;
        String result = "";
        while(ref != null)
        {
            result += ref.data + "->";
            ref = ref.next;
        }
        return result;
    }

    public void addEnd(Node e)
    {
        if(isEmpty())
            head = e;
        else{
            Node fast = head;
            Node slow = head;
            while(fast != null)
            {
                slow = fast;
                fast = fast.next;
            }
            slow.next = e;
        }
    }
    public void addIndex(Node e, int index)
    {
        if(index < 0 && index > size())
        {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0)
        {
            head = e;
        }

        Node pred = head;
        for(int k = 1; k < index; k++)
            pred = pred.next;
        if(pred.next != null)
            e.next = pred.next;
        pred.next = e;
    }
}