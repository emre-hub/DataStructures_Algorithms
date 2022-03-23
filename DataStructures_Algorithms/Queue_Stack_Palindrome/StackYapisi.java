package DataStructures_Algorithms.Queue_Stack_Palindrome;

public class StackYapisi {
    Node top;
    int size;
    int cnt;

    public StackYapisi(int size) {
        this.size = size;
        cnt = 0;
    }

    void push( char ch ){
        if(!isFull()){
            Node eleman = new Node(ch);
            if(isEmpty()){
                top = eleman;
            }else{
                eleman.next = top;
                top = eleman;
            }
            cnt++;
        }
    }

    char pop(){
        if( !isEmpty() ){
            char harf = top.harf;
            top = top.next;
            cnt--;
            return harf;
        }else{
            return '-';
        }
    }

    boolean isEmpty(){
        return cnt == 0;
    }

    boolean isFull(){
       return cnt == size;
    }
}
