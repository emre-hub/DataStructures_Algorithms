package DataStructures_Algorithms.Stack_withArrays;

public class Stack_Yigin {
    int arr[];
    int size;
    int index;

    public Stack_Yigin(int size) {
        this.size = size;
        this.arr = new int[size];
        this.index = -1;
    }

    void push(int data){
        if(isFull()){
            System.out.println("StackYapisi dolu !");
        }else{
            index++;
            arr[index] = data;
            System.out.println("push () : " + arr[index]);
        }
    }

    int pop(){
        if(isEmpty()){
            System.out.println("StackYapisi boş!");
            return -1;
        }else{
            return arr[index--];
        }
    }

    boolean isFull(){
        return (index == size-1);
    }

    boolean isEmpty(){
        return (index == -1);
    }

}
