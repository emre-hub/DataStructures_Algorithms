package DataStructures_Algorithms.Stack;

public class StackStructure {
    int size;
    int cnt;

    Node top; //Yığının en tepesindeki düğüm

    public StackStructure(int size) {
        this.size = size;
        cnt = 0;
        top = null;
    }

    void push(int data){
        Node element = new Node(data);
        if(isFull()){
            System.out.println("The StackYapisi is full!");
        }else{
            if(isEmpty()){
                top = element;
                top.next = null;
                System.out.println(top.data + " is added to StackYapisi as first element.");
            }else{
                element.next = top;
                top = element;
                System.out.println(top.data + " is added to StackYapisi.");
            }
            cnt++;
        }
    }

    void pop(){
        if(isEmpty()){
            System.out.println("The StackYapisi is empty.");
        }else{
            System.out.println(top.data + " is removed from StackYapisi.");
            top = top.next;
            cnt--;
        }
    }

    boolean isFull(){
        return (cnt == size);
    }

    boolean isEmpty(){
        return (cnt == 0);
    }

    void print(){
        if(isEmpty()){
            System.out.println("The StackYapisi is empty.");
        }else{
            Node temp = top;
            System.out.println("Data on stack : ");
            System.out.print("Top | ");
            while(temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("| End");
        }
    }

    void showTop(){
        if(isEmpty()){
            System.out.println("The StackYapisi is empty, there is no top element.");
        }else{
            System.out.println("The Top element is : " + top.data);
        }
    }
}
