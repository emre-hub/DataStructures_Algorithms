package DataStructures_Algorithms.CiftYonluBagliListe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BagliListe bl = new BagliListe();

        int secim = -1;
        int data, index = 0;
        bl.sondanYazdir();
        while(secim != 0){
            System.out.println("1- Başa Ekle");
            System.out.println("2- Sona Ekle");
            System.out.println("3- Araya Ekle");
            System.out.println("4- Baştan Sil");
            System.out.println("5- Sondan Sil");
            System.out.println("6- Aradan Sil");
            System.out.println("7- Sondan Başa Yazdır");
            System.out.println("0- Çıkış");
            System.out.println("Seçiminiz :  ");

            secim = sc.nextInt();

            if(secim == 0)
                System.out.println("Program Sonlandırıldı.");
            else if(secim == 1){
                System.out.println("Başa Ekleyeceğiniz Sayıyı Giriniz : ");
                data = sc.nextInt();
                bl.basaEkle(data);
            }else if(secim == 2){
                System.out.println("Sona Ekleyeceğiniz Sayıyı Giriniz : ");
                data = sc.nextInt();
                bl.sonaEkle(data);
            }else if(secim == 3){
                System.out.println("Sayıyı Ekleyeceğiniz Index'i Giriniz :  ");
                index = sc.nextInt();
                System.out.println("Listeye Ekleyeceğiniz Sayıyı Giriniz : ");
                data = sc.nextInt();
                bl.arayaEkle(index, data);
            }else if(secim == 4){
                bl.bastanSil();
            }else if(secim == 5){
                bl.sondanSil();
            }else if(secim == 6){
                System.out.println("Sileceğiniz Ogrenci'un Index'ini Giriniz : ");
                index = sc.nextInt();
                bl.aradanSil(index);
            }else if(secim == 7){
                bl.sondanYazdir();
            }else{
                System.out.println("Hatalı Seçim.");
            }

            bl.yazdir();
        }
    }
}
