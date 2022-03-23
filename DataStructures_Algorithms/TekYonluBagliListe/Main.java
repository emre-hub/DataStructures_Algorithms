package DataStructures_Algorithms.TekYonluBagliListe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TekYonluListeYapisi tyList = new TekYonluListeYapisi();
        int secim = -1;
        int sayi, indis;

        while(secim != 0){
            System.out.println("1- Başa Ekle ");
            System.out.println("2- Sona Ekle ");
            System.out.println("3- Araya Ekle ");
            System.out.println("4- Baştan Sil ");
            System.out.println("5- Sondan Sil ");
            System.out.println("6- Aradan Sil ");
            System.out.println("0 - Çıkış ");
            System.out.println("Seçim : ");
            secim = scanner.nextInt();

            if(secim == 1){
                System.out.println("Sayı : ");
                sayi = scanner.nextInt();
                tyList.basaEkle(sayi);
            }else if(secim == 2){
                System.out.println("Sayı : ");
                sayi = scanner.nextInt();
                tyList.sonaEkle(sayi);
            }else if(secim == 3){
                System.out.println("Sayı : ");
                sayi = scanner.nextInt();
                System.out.println("Index : ");
                indis = scanner.nextInt();
                tyList.arayaEkle(indis, sayi);
            }else if(secim == 4){
                tyList.bastanSil();
            }else if(secim == 5){
                tyList.sondanSil();
            }else if(secim == 6){
                System.out.println("Index : ");
                indis = scanner.nextInt();
                tyList.aradanSil(indis);
            }else if(secim == 0){
                System.out.println("Program Sonlandırıldı....");
            }else{
                System.out.println("Hatalı bir seçim yaptınız.");
            }
            System.out.println("\nListe : ");
            tyList.yazdir();
            System.out.println();
        }
    }
}
