package Exam2Answers;

public class BinaryTreeBasics {

    //Questions:
    //1. The root node: A
    //2. All Leaf Nodes: D, E, F
    //3. Post-Order Sequence: D, E, B, F, C, A
    //4. Pre-Order Sequence: A, B, D, E, C, F
    //5. In-order Sequence: D, B, E, A, F, C
    public static void main(String[] args) {
        Node root = new Node('A');
        root.lChild = new Node('B');
        root.rChild = new Node('C');

        root.lChild.lChild = new Node('D');
        root.lChild.rChild = new Node('E');

        root.rChild.lChild = new Node('F');
        printInOrder(root);
    }

    public static void printInOrder(Node root) {
        //Don't do anything if the current root is null
        if(root == null) {
            return;
        }
        //Visit the left child, print the data, then visit the right child
        printInOrder(root.lChild);
        System.out.print(root.data + ", ");
        printInOrder(root.rChild);
    }

}
