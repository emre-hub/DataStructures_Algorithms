package DataStructures_Algorithms.Queue_withArrays;

public class Main {
    public static void main(String[] args) {
        QueueYapisi kuyruk = new QueueYapisi(5);
        kuyruk.enQueue(10);
        kuyruk.enQueue(5);
        kuyruk.enQueue(20);
        kuyruk.elemanSayisi();
        kuyruk.deQueue();
        kuyruk.elemanSayisi();
        kuyruk.deQueue();
        kuyruk.deQueue();
        kuyruk.elemanSayisi();
        kuyruk.enQueue(10);
        kuyruk.enQueue(5);
        kuyruk.enQueue(20);
        kuyruk.yazdir();

    }
}
