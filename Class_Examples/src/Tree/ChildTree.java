package Tree;


import java.util.ArrayList;
import java.util.List;

public class ChildTree<E> {

    private static class ChildNode {
        private int pos;
        private ChildNode next;

        public ChildNode(int pos, ChildNode next) {
            this.pos = pos;
            this.next = next;
        }
    }

    public static class Node<T> {
        T data;
        ChildNode first;// first node

        public Node() {
        }

        public Node(T data) {
            this.data = data;
            this.first = null;
        }

        public String toString() {
            if (first != null) {
                return "TreeChild$Node[data=" + data + ", first=" + first.pos
                        + "]";
            }
            return "TreeChild$Node[data=" + data + ", first=-1]";
        }
    }

    private final int DEFAULT_TREE_SIZE = 100;
    private int treeSize = 0;

    private Node<E>[] nodes;

    private int nodeNums;

    @SuppressWarnings("unchecked")
    public ChildTree(E data) {
        treeSize = DEFAULT_TREE_SIZE;
        nodes = new Node[treeSize];
        nodes[0] = new Node<E>(data);
        nodeNums++;
    }

    @SuppressWarnings("unchecked")
    public ChildTree(E data, int treeSize) {
        this.treeSize = treeSize;
        this.nodes = new Node[treeSize];
        nodes[0] = new Node<E>(data);
        nodeNums++;
    }

    public void addNode(E data, Node<E> node) {
        for (int i = 0; i < treeSize; i++) {
            if (nodes[i] == null) {
                nodes[i] = new Node<E>(data);
                if (node.first == null) {
                    node.first = new ChildNode(i, null);
                } else {
                    ChildNode next = node.first;
                    while (next.next != null) {
                        next = next.next;
                    }
                    next.next = new ChildNode(i, null);
                }
                nodeNums++;
                return;
            }
        }
        throw new RuntimeException("Cannot add new node -- the tree is full");
    }

    public boolean isEmpty() {
        return nodes[0] == null;
    }

    public Node<E> getRoot() {
        return nodes[0];
    }

    public List<Node<E>> getChildren(Node<E> node) {
        List<Node<E>> list = new ArrayList<Node<E>>();
        ChildNode next = node.first;
        while (next != null) {
            list.add(nodes[next.pos]);
            next = next.next;
        }
        return list;
    }

    public Node<E> getChildByIndex(Node<E> node, int index) {
        ChildNode next = node.first;
        for (int i = 0; next != null; i++) {
            if (index == i) {
                return nodes[next.pos];
            }
            next = next.next;
        }
        return null;
    }

    private int getDeep(Node<E> node) {
        if (node.first == null) {
            return 1;
        } else {
            int max = 0;
            ChildNode next = node.first;
            while (next != null) {
                int tmp = this.getDeep(nodes[next.pos]);
                if (tmp > max) {
                    max = tmp;
                }
                next = next.next;
            }

            return max + 1;
        }
    }

    public int getDeep() {
        return this.getDeep(getRoot());
    }

    public int pos(Node<E> node) {
        for (int i = 0; i < treeSize; i++) {
            if (nodes[i] == node) {
                return i;
            }
        }
        return -1;
    }

}