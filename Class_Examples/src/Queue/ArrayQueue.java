package Queue;

public class ArrayQueue
{
    private String[] q;
    private int rear;
    private int front;
    private int size = 0;

    public ArrayQueue(int s)
    {
        q = new String[s];
        rear = 0;
        front = 0;

    }

    public void enqueue(String s)
    {
        if(size == q.length)
            throw new IllegalStateException();
        else
        {
            // Add to rear
            size ++;
            q[rear] = s;
            rear ++;
            // If at end of array, wrap around
            if(rear == q.length) rear = 0;
        }
    }

    public boolean empty()
    {
        return size == 0;
    }
    public String deque()
    {
        if(empty())
            throw new IllegalStateException();
        else
        {
            size --;
            // Remove from front
            String value = q[front];

            // Facilitate garbage collection
            q[front] = null;

            // Update front
            front ++;
            if(front == q.length) front = 0;

            return value;
        }
    }
}
