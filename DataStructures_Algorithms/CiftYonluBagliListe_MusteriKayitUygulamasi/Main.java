package DataStructures_Algorithms.CiftYonluBagliListe_MusteriKayitUygulamasi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedListStructure list  = new LinkedListStructure();
        int secim = -1;

        while (secim != 0){
            System.out.println("1- Ekle");
            System.out.println("2- Sil");
            System.out.println("3- Güncelle");
            System.out.println("4- Müşteri Ara");
            System.out.println("5- Yazdır");
            System.out.println("0- Çıkış");
            System.out.println("\nSeçiminiz : ");
            secim = scanner.nextInt();
            scanner.nextLine();

            switch(secim){
                case 1 : list.add();break;
                case 2 : list.delete();break;
                case 3 : list.update();break;
                case 4 : list.customerSearch();break;
                case 5 : list.printList();break;
                case 0 : System.out.println("Program sonlandırıldı."); break;
                default: System.out.println("Hatalı seçim yaptınız. [0-5] seçiniz. "); break;
            }
        }



    }

}
