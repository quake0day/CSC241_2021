package Exam2Answers;

public class BinaryHeap {

    int[] heap;

    public BinaryHeap(int[] binaryHeap) {
        heap = binaryHeap;
    }

    public int findParentValue(int value) {
        int index = -1;
        for(int i = 0; i < heap.length; i++) {
            if(heap[i] == value) {
                index = i;
                break;
            }
        }
        //Index -1 is if it isn't found, index 1 is if it is the root node and doesn't have a parent
        if(index == -1 || index == 1) {
            return -1;
        }
        //Return the VALUE of the index found
        return heap[(int) Math.floor(index / 2)];
    }

}
