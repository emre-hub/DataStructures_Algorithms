package DataStructures_Algorithms.Queue_Stack_Palindrome;

import java.util.Scanner;

public class QueueYapisi {
    Scanner sc = new Scanner(System.in);
    Node front;
    Node rear;
    int cnt;
    int size;

    public QueueYapisi(int size){
        this.size = size;
        front = null;
        rear = null;
        cnt = 0;
    }

    void enQueue(char ch){
        if( !isFull() ){
            Node eleman = new Node(ch);
            if(isEmpty()){
                front = eleman;
                rear = eleman;
            }else{
                rear.next = eleman;
                rear = eleman;
            }
            cnt++;
        }
    }

    char deQueue(){
        if(!isEmpty()){
            char ch = front.harf;
            front = front.next;
            cnt--;
            return ch;
        }else{
            return '+';
        }
    }

    boolean isEmpty(){
        return cnt == 0;
    }

    boolean isFull(){
        return cnt == size;
    }
}
