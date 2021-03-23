package Tree;

import java.util.ArrayList;
import java.util.List;

// Parent Tree
public class ParentTree<T>{
    private int treeSize=0;		// tree size

    private Node<T>[] nodes;	//Node array

    private int nodeNums;

    public ParentTree() {}

    public ParentTree(T data,int treeSize){
        this.treeSize=treeSize;
        nodes=new Node[treeSize];
        nodes[0]=new Node(data, -1);
        nodeNums++;
    }

    public void addNode(Node n){
        if(nodeNums==treeSize){
            try {
                throw new Exception("Tree is full");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        for(int i=0;i<treeSize;i++)
        {
            //add node once we find a null position
            if(nodes[i]==null){
                nodes[i]=n;
                nodeNums++;
                break;	//end loop
            }
        }
    }

    public void addNode(T data,Node parent){
        if(nodeNums==treeSize){
            try {
                throw new Exception("Tree is full");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        for(int i=0;i<treeSize;i++)
        {
            //add node once we find a null position
            if(nodes[i]==null){
                nodes[i]=new Node(data, getNodeIndex(parent));
                nodeNums++;
                break;	//end loop
            }
        }
    }


    public int getNodeIndex(Node node){
        for(int i=0;i<treeSize;i++)
        {
            if(nodes[i]==node){
                return i;
            }
        }
        return -1;
    }


    public boolean isEmpty(){
        return nodes[0]==null;
    }

    public List<Node<T>> getAllChildren(Node parent){
        List<Node<T>> list=new ArrayList<>();
        for(int i=0;i<treeSize;i++)
        {
            if(nodes[i].parent!=-1&&nodes[i].parent==getNodeIndex(parent)){
                list.add(nodes[i]);
            }
        }
        return list;
    }

    public int getDeep(){
        int maxDeep=0; 	//maximum depath
        for(int i=0;i<treeSize&&nodes[i]!=null;i++)
        {
            int index=1;
            // get parents position
            int m=nodes[i].parent;
            while(m!=-1&&nodes[m]!=null){
                m=nodes[m].parent;	//go up
                index++;
            }
            if(maxDeep<index){
                maxDeep=index;
            }
        }
        return maxDeep;
    }

    //get root node
    public Node getRoot(){
        return nodes[0];
    }
}