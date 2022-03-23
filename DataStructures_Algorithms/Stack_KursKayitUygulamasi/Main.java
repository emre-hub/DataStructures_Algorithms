package DataStructures_Algorithms.Stack_KursKayitUygulamasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, secim = -1;
        System.out.println("Kursa kayıt edilecek kişi sayısı : "); n = sc.nextInt();
        KursStack bilgisayarKursListesi = new KursStack(n);

        while(secim != 0){
            System.out.println("1-Kursa Yeni Kayıt");
            System.out.println("2-En Son Kaydı Sil");
            System.out.println("3-Kursa Kayıtlı Kişiler");
            System.out.println("4-Kursa Kaydolan Son Kişinin Bilgileri");
            System.out.println("5-Kalan Kontenjan");
            System.out.println("0-Çıkış");
            System.out.println("Seçiminiz : "); secim = sc.nextInt();

            switch(secim){
                case 0 : System.out.println("Çıkış Yapılıyor..."); break;
                case 1 : bilgisayarKursListesi.ekle(); break;
                case 2 : bilgisayarKursListesi.sil(); break;
                case 3 : bilgisayarKursListesi.yazdir(); break;
                case 4 : bilgisayarKursListesi.enSonKayitOlanKisi(); break;
                case 5 : bilgisayarKursListesi.kalanKontenjanSayisi(); break;
                default: System.out.println("Hatalı Seçim Yaptınız."); break;
            }
        }
    }
}

