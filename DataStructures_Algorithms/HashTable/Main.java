package DataStructures_Algorithms.HashTable;

public class Main {
    public static void main(String[] args) {
        Table hTablo = new Table(5);
        hTablo.ekle(0, "ahmet");
        hTablo.ekle(10, "mehmet");
        hTablo.ekle(3, "hasan");
        hTablo.ekle(4, "hüseyin");
        hTablo.ekle(2,"ayşe");
        hTablo.ekle(22,"fatma");
        hTablo.ekle(15,"beyza");
        hTablo.ekle(9, "ece");

        hTablo.yazdir();
    }
}
