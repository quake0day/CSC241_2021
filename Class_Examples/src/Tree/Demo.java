package Tree;

public class Demo
{
    public static void main(String[] args)
    {
        // parent method
        ParentTree<String> pt = new ParentTree<>("A", 10);
        Node root = pt.getRoot();
        Node<String> nodeB = new Node<>("B", 0);
        Node<String> nodeC = new Node<>("C", 0);
        Node<String> nodeD = new Node<>("D", 1);
        Node<String> nodeE = new Node<>("E", 2);
        Node<String> nodeF = new Node<>("F", 2);
        Node<String> nodeG = new Node<>("G", 3);
        Node<String> nodeH = new Node<>("H", 3);
        Node<String> nodeI = new Node<>("I", 3);
        Node<String> nodeJ = new Node<>("J", 4);
        pt.addNode(nodeB);
        pt.addNode(nodeC);
        pt.addNode(nodeD);
        pt.addNode(nodeE);
        pt.addNode(nodeF);
        pt.addNode(nodeH);
        pt.addNode(nodeI);
        pt.addNode(nodeJ);

        // child method
        ChildTree<String> tc = new ChildTree<>("A", 10);

    }
}