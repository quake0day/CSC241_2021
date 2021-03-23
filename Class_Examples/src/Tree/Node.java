package Tree;

class Node<T>{
    T data;	//data
    int parent;	//parent node id

    public Node() {	}
    public Node(T data,int parent){
        this.data=data;
        this.parent=parent;
    }

    @Override
    public String toString() {
        return this.data+"";
    }
}
