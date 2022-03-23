package DataStructures_Algorithms.TekYonluDaireselBagliListe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedList liste = new CircularLinkedList();
        int secim = -1;
        while(secim != 0){
            System.out.println("1- Başa Ekle");
            System.out.println("2- Sona Ekle");
            System.out.println("3- Araya Ekle");
            System.out.println("4- Baştan Sil");
            System.out.println("5- Aradan Sil");
            System.out.println("6- Sondan Sil");
            System.out.println("0- Çıkış");
            System.out.println("Seçiminiz : ");

            secim = sc.nextInt();
            sc.nextLine();

            switch (secim){
                case 0 : System.out.println("Program Sonlandırıldı."); break;
                case 1: liste.prepend(); break;
                case 2: liste.addToEnd(); break;
                case 3: liste.insert(); break;
                case 4: liste.removeFirst(); break;
                case 5: liste.remove(); break;
                case 6: liste.removeLast(); break;

                default: System.out.println("Hatalı seçim yaptınız."); break;
            }
            liste.print();

        }
    }
}
