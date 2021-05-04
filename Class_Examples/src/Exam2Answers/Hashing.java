package Exam2Answers;

public class Hashing {
    int[] table;
    int size;

    public Hashing(int s) {
        table = new int[s];
        size = s;
        //Fill with -1's
        for(int i = 0; i < s; i++) {
            table[i] = -1;
        }
    }

    public void put(int k) {
        int i = 0;
        //Hashing function
        int index = (k + i) % 19;
        //Only runs if there was a collision
        while(table[index] != -1) {
            i++;
            index = (k + i) % 19;
        }
        table[index] = k;
    }

    public void printHashTable() {
        for(int x : table) {
            System.out.print(x + ",");
        }
    }

}
