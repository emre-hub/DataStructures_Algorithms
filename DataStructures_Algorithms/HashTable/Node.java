package DataStructures_Algorithms.HashTable;

public class Node {
    int key;      //key
    String isim; //value
    Node next; //pointer

    public Node(){
        next = null;
    }

    public Node(int key, String isim){
        this.key = key;
        this.isim = isim;
        next = null;
    }
}
