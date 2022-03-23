package DataStructures_Algorithms.CiftYonluDaireselBagliListe_OtoparkUygulamasi;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        BagliListe liste = new BagliListe();
        int secim = -1;
        while(secim != 0){
            System.out.println("1- Otoparka araç girişi");
            System.out.println("2- Otopark'tan araç çıkışı");
            System.out.println("3- Otopark'taki araçları listele");
            System.out.println("4- Toplam kazanç");
            System.out.println("0- Çıkış");
            System.out.println("Seçiminiz : "); secim = sc.nextInt();

            switch(secim){
                case 0 : System.out.println("Program Sonlandırıldı"); break;
                case 1 : liste.ekle(); break;
                case 2 : liste.sil(); break;
                case 3 : liste.yazdir(); break;
                case 4  : System.out.println("Kazanç : " + liste.toplamUcret); break;
                default: System.out.println("Hatalı seçim yaptınız.");
            }
        }
        liste.yazdir();
        System.out.println("Kazanç : " + liste.toplamUcret);
    }
}
