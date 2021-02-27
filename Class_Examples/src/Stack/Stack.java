package Stack;

public class Stack {
    private int top = 0;
    private int[] storage;

    Stack(int capacity){
        if(capacity <= 0)
            throw new IllegalArgumentException();
        storage = new int[capacity];
    }

    boolean isEmpty(){
        return top == 0;
    }

    void push (int val){
        storage[top] = val;
        top ++;
    }

    int pop(){
        int returnVal = storage[top-1];
        top --;
        return returnVal;
    }

    int peek(){
        int returnVal = storage[top-1];
        return returnVal;
    }

}
