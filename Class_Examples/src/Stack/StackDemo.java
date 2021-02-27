package Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack n = new Stack(4);
        n.push(10);
        n.push(20);
        System.out.println(n.pop());
        System.out.println(n.peek());
        System.out.println(n.isEmpty());
    }
}
