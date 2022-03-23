package DataStructures_Algorithms.HashTable.OgrenciKayitUygulamasi;

public class Main {
    public static void main(String[] args) {
        Table ht = new Table(5);
        ht.ekle(11230,"ali",55);
        ht.ekle(11232,"vel",40);
        ht.sil(11232);
        ht.sil(11232);
        ht.sil(1123442);
        ht.ara(11230);
        ht.ara(1230);
        //ht.yazdir();
    }
}
