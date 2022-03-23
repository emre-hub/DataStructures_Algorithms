package DataStructures_Algorithms.Queue;

public class QueueStructure {
    Node front;  //head
    Node rear;   //tail
    int cnt;     //counter
    int size;

    public QueueStructure(int size){
        this.size = size;
        cnt = 0;
        front = null;
        rear = null;
    }

    void enQueue(int data){
        if( isFull() ){
            System.out.println("Kuyruk dolu. Ekleme yapılamaz.");
        }else{
            Node eleman = new Node(data);
            if( isEmpty() ){
                front = rear = eleman;
                System.out.println(data + " kuyruğa ilk eleman olarak eklendi.");
            }
            else{
                rear.next = eleman;
                rear = rear.next;
                System.out.println(data + " kuyruğa eleman olarak eklendi.");
            }
            cnt++;
        }
    }

    void deQueue(){
        if(isEmpty()){
            System.out.println("Kuyruk boş, silinecek eleman yok.");
        }else{
            System.out.println(front.data + " (front) silindi.");
            front = front.next;
            cnt--;
        }
    }

    void printQueue(){
        if(isEmpty()){
            System.out.println("Kuyruk boş, eleman yok.");
        }else{
            Node temp = front;
            System.out.print("Front | ");
            while(temp != null){
                System.out.print(temp.data + " <- ");
                temp = temp.next;
            }
            System.out.println(" | End");
        }
    }

    private boolean isEmpty() {
        return cnt == 0;
    }

    private boolean isFull() {
        return size == cnt;
    }


}
