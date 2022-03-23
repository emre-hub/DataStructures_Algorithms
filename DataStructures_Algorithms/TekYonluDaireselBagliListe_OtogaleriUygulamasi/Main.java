package DataStructures_Algorithms.TekYonluDaireselBagliListe_OtogaleriUygulamasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BagliListe liste = new BagliListe();
        int secim = -1;
        while(secim != 0){
            System.out.println("1- Otomobil Ekle");
            System.out.println("2- Otomobil Sat");
            System.out.println("3- Otomobilleri Listele");
            System.out.println("4- Otomobil Ara");
            System.out.println("0- Çıkış");
            System.out.println("Seçiminiz : "); secim = sc.nextInt();

            switch (secim){
                case 1 : liste.ekle(); break;
                case 2 : liste.sil(); break;
                case 3 : liste.yazdir(); break;
                case 4 : liste.aracAra(); break;
                case 0 : System.out.println("Program Sonlandırıldı."); break;
                default: System.out.println("Hatalı Seçim."); break;
            }
        }
    }
}
