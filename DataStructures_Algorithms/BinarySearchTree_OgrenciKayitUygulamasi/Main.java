package DataStructures_Algorithms.BinarySearchTree_OgrenciKayitUygulamasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no, not;
        String ad;

        BinarySearchTree ogr = new BinarySearchTree();

        int secim = menu();
        while(secim != 0){
            switch (secim){
                case 1 :
                    System.out.println("Eklenecek öğrenci bilgilerini giriniz : ");
                    System.out.print("Numara : "); no = sc.nextInt();
                    System.out.print("Not : ");    not = sc.nextInt();
                    System.out.print("Ad  :");     ad = sc.next();
                    ogr.root = ogr.insert(ogr.root, no,ad,not);
                    System.out.println(no + " numaralı öğrenci eklendi.");
                    break;
                case 2 :
                    System.out.println("Silinecek öğrenci numarasını giriniz : "); no = sc.nextInt();
                    ogr.root = ogr.delete(ogr.root, no);
                    System.out.println(no + " numaralı öğrenci silindi.");
                    break;
                case 3 : System.out.println("NO\t" + "AD\t" + "NOT"); ogr.inOrder(ogr.root); break;
                case 0 : break;
                default:
                    System.out.println("Hatalı seçim yaptınız"); break;
            }
            secim = menu();
        }


    }

    private static int menu() {
        int secim;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n1- Ekle");
        System.out.println("2- Sil");
        System.out.println("3- Yazdır");
        System.out.println("0- Çıkış");
        System.out.println("Seçiminiz : ");

        secim = sc.nextInt();
        return secim;
    }
}
