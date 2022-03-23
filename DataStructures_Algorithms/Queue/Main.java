package DataStructures_Algorithms.Queue;

public class Main {
    public static void main(String[] args) {
        QueueStructure kuyruk = new QueueStructure(5);
        kuyruk.enQueue(10);
        kuyruk.enQueue(20);
        kuyruk.enQueue(30);
        kuyruk.printQueue();
        kuyruk.deQueue();
        kuyruk.printQueue();
        kuyruk.enQueue(40);
        kuyruk.enQueue(50);
        kuyruk.enQueue(60);
        kuyruk.printQueue();
    }
}
