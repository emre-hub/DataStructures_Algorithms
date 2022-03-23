package DataStructures_Algorithms.Queue_withArrays;

public class QueueYapisi {
    int[] dizi;
    int size;
    int front;
    int rear;

    public QueueYapisi(int size) {
        this.size = size;
        dizi = new int[size]; //queue
        front = 0;
        rear = -1;
    }

    void enQueue(int data){
        if( isFull() ){
            System.out.println("Kuyruk dolu, ekleme yapamazsınız.");
        }else{
            rear++;
            dizi[rear] = data;
            System.out.println(dizi[rear] + " kuyruğa eklendi.");
        }

    }

    void deQueue(){
        if( isEmpty() ){
            System.out.println("Kuyruk boş, silinecek eleman yok.");
        }else{
            int sayi = dizi[front];
            for(int i = 1; i <= rear; i++){ //sliding the elements
                dizi[i-1] = dizi[i];
            }
            rear--;
            System.out.println("Sayı kuyruktan çıkartıldı.");
        }
    }

    void elemanSayisi(){
        System.out.println("Kuyruktaki eleman sayısı  : " + (rear+1) );
    }

    private boolean isEmpty() {
        return rear == -1;
    }

    private boolean isFull() {
        return rear == size - 1;
    }

    void yazdir(){
        System.out.println("Kuyruktaki Elemanlar : ");
        int i = rear;
        System.out.print("rear | ");
        while( i >= 0){
            System.out.print(dizi[i] + " -> ");
            i--;
        }
        System.out.println(" | front");
    }
}
