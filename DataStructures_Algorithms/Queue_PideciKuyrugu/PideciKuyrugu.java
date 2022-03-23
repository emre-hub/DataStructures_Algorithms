package DataStructures_Algorithms.Queue_PideciKuyrugu;

import java.util.Scanner;

public class PideciKuyrugu {
    Scanner sc = new Scanner(System.in);
    Node front;
    Node rear;
    int size;
    int cnt;

    String isim;
    int adet;

    int toplamKazanc = 0;

    public PideciKuyrugu(int size) {
        this.size = size;
        cnt = 0;
        front = null;
        rear = null;
    }

    void enQueue(){
        if(isFull()){
            System.out.println("Kuyruk dolu.");
        }else{
            System.out.print("Müşterinin adı : "); isim = sc.nextLine();
            System.out.println();
            System.out.print("Müşterinin alacağı pide sayısı : "); adet = sc.nextInt();
            sc.nextLine();
            Node eleman = new Node(isim, adet);

            if(isEmpty()){
                front = rear = eleman;
                System.out.println("İlk müşteri kuyruğa girdi.");
            }else{
                rear.next = eleman;
                rear = eleman;
                System.out.println(rear.isim + " pide kuyruğuna girdi.");
            }
            cnt++;
        }
    }

    void deQueue(){
        if(isEmpty()){
            System.out.println("Kuyrukta kimse yok.");
        }else{
            System.out.println(front.isim + " " +  front.adet + " pide aldı ve kuyruktan çıktı. Ödediği ücret : " + front.ucret + " TL");
            toplamKazanc += front.ucret;
            front = front.next;
            cnt--;
        }
    }

    void print(){
        if(isEmpty()){
            System.out.println("Bekleyen müşteri yok.");
        }else{
            Node temp = front;
            System.out.print("Baş | ");
            while(temp.next != null){
                System.out.print( temp.isim +  " -> ");
                temp = temp.next;
            }
            System.out.println( temp.isim +  " -> " + " | Son");
        }
    }

    private boolean isFull(){
        return size == cnt;
    }

    private boolean isEmpty(){
        return cnt == 0;
    }
}
