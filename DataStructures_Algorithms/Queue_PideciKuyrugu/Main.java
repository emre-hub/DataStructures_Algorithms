package DataStructures_Algorithms.Queue_PideciKuyrugu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secim = -1;
        int n;
        System.out.print("Kuyruğa girebilecek maksimum müşteri sayısı : "); n = sc.nextInt();
        System.out.println();
        PideciKuyrugu kuyruk = new PideciKuyrugu(n);
        while(secim != 0){
            System.out.println("1 - Yeni müşteri ekle.");
            System.out.println("2 - Satış yap.");
            System.out.println("3 - Bekleyen müşterileri göster.");
            System.out.println("4 - Toplam kazancı göster.");
            System.out.println("0 - Çıkış  yap.");
            System.out.print("Seçiminiz : ");
            secim = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (secim){
                case 1 : kuyruk.enQueue(); break;
                case 2 : kuyruk.deQueue(); break;
                case 3 : kuyruk.print(); break;
                case 4 : System.out.println("Toplam Kazanç : " + kuyruk.toplamKazanc); break;
                case 0 : System.out.println("Dükkan kapandı. İyi günler...."); break;
                default: System.out.println("Hatalı seçim yaptınız."); break;
            }


        }
    }
}
