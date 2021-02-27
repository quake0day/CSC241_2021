package Stack;

public class LinkedListStack {
    private Node top;

    LinkedListStack(){
        top = null;
    }

    //   1->2->3 ==> push 5
    //  5 -> 1 -> 2 -> 3

    void push(int val)
    {
        Node newTop = new Node(val);
        newTop.next = top;
        top = newTop;
    }

   int pop()
   {
        // 5 -> 1 -> 2 -> 3   // call pop() ==> 1->2->3
       if(top == null) throw new IllegalArgumentException();
       int val = top.data;
       top = top.next;
       return val;
   }

   int peek()
   {
       if(top == null) throw new IllegalArgumentException();
       int val = top.data;
       return val;
   }

   boolean isEmpty()
   {
       return top == null;
   }
}
