package DataStructures_Algorithms.LinkedList_OgrenciKayitUygulamasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secim = -1;
        OgrListe bilgisayarBolumu = new OgrListe();

        System.out.println("****Bilgisayar Bölümü Öğrenci Kayıt Uygulaması****");
        while ( secim != 0 ){
            System.out.println();
            System.out.println("1- Yeni Kayıt");
            System.out.println("2- Kayıt Sil");
            System.out.println("3- Kayıtları Listele");
            System.out.println("4- En Başarılı Öğrenci'nin Bilgileri");
            System.out.println("0- Çıkış");
            System.out.println("Seçiminiz : ");

            secim = sc.nextInt();

            if(secim == 1)
                bilgisayarBolumu.ekle();
            else if(secim == 2)
                bilgisayarBolumu.sil();
            else if(secim == 3)
                bilgisayarBolumu.yazdir();
            else if(secim == 4)
                bilgisayarBolumu.enBasariliOgrenci();
            else if(secim == 0)
                System.out.println("Program Sonlandırılıyor....");
            else
                System.out.println("Hatalı Seçim Yaptınız (0 - 4 arasında bir numara giriniz.)");
        }
    }
}
