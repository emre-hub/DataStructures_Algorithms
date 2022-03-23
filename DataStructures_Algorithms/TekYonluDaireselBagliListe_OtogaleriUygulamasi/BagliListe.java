package DataStructures_Algorithms.TekYonluDaireselBagliListe_OtogaleriUygulamasi;

import java.util.Scanner;

public class BagliListe { //Tek yönlü dairesel bağlı liste. //Circular Linked List
    Scanner sc = new Scanner(System.in);

    OtoNode head = null;
    OtoNode tail = null;

    String plaka;
    String marka;
    String model;
    String renk;
    int alisFiyat;
    int satisFiyat;
    String aciklama;

    void ekle(){
        System.out.println("Galeriye eklenecek otomobilin bilgilerini giriniz : ");
        System.out.print("Plaka : "); plaka = sc.nextLine();
        System.out.print("Marka : "); marka = sc.nextLine();
        System.out.print("Model : "); model = sc.nextLine();
        System.out.print("Renk : "); renk = sc.nextLine();
        System.out.print("Alış Fiyatı : "); alisFiyat = sc.nextInt();
        sc.nextLine();
        System.out.print("Açıklama : "); aciklama = sc.nextLine();

        OtoNode arac = new OtoNode(plaka, marka, model, renk, alisFiyat, aciklama);

        if(head == null){
            head = arac;
            tail = arac;
            tail.next = head;
            System.out.println(plaka + " plakalı araç oto galeriye eklendi.");
        }else{
            arac.next = head;
            head = arac;
            tail.next = head;
            System.out.println(plaka + " plakalı araç oto galeriye eklendi.");
        }
    }

    void sil(){
        if(head == null){
            System.out.println("Galeride araç yok.");
        }else{
            System.out.println("Satışı yapılacak otomobilin plakası : "); plaka = sc.nextLine();
            if(head == tail && head.plaka.equals(plaka) ){
                System.out.println(plaka + " plakalı araç " + head.satisFiyat + " TL'ye satıldı.");
                head = null;
                tail = null;
            }
            else if(head != tail && head.plaka.equals(plaka) ){
                System.out.println(plaka + " plakalı araç " + head.satisFiyat + " TL'ye satıldı.");
                head = head.next;
                tail.next = head;
            }else{
                OtoNode temp = head;
                OtoNode temp2 = temp;

                while (temp != tail){
                    if(temp.plaka.equals(plaka)){
                        System.out.println(plaka + " plakalı araç " + temp.satisFiyat + " TL'ye satıldı.");
                        temp2.next = temp.next;
                    }
                    temp2 = temp;
                    temp = temp.next;
                }
                if(temp.plaka.equals(plaka)){
                    System.out.println(plaka + " plakalı araç " + temp.satisFiyat + " TL'ye satıldı.");
                    tail = temp2;
                    tail.next = head;
                }
            }
        }
    }

    void yazdir(){
        if(head == null){
            System.out.println("Oto galeride araç yok.");
        }else{
            System.out.println("Plaka\t\tMarka\t\tModel\t\tRenk\t\taFiyat\t\tsFiyat\t\tAciklama");
            OtoNode temp = head;
            while(temp != tail){
                System.out.println(temp.plaka + "\t\t" + temp.marka  + "\t\t" + temp.model  + "\t\t" + temp.renk  + "\t\t" + temp.alisFiyat  + "\t\t" + temp.satisFiyat  + "\t\t" + temp.aciklama );
                temp = temp.next;
            }
            System.out.println(temp.plaka + "\t\t" + temp.marka  + "\t\t" + temp.model  + "\t\t" + temp.renk  + "\t\t" + temp.alisFiyat  + "\t\t" + temp.satisFiyat  + "\t\t" + temp.aciklama );
        }
    }

    void aracAra(){

        if(head == null){
            System.out.println("Oto galeride araç yok");
        }else{
            boolean sonuc = false;
            System.out.println("Aradığınız aracın plakasını giriniz : "); plaka = sc.nextLine();
            OtoNode temp = head;
            OtoNode temp2 = head;
            while(temp != tail){
                if(temp.plaka.equals(plaka)){
                    temp2 = temp;
                    sonuc = true;
                }
                temp = temp.next;
            }
            if(temp.plaka.equals(plaka)){
                temp2 = temp;
                sonuc = true;
            }
            if(!sonuc){
                System.out.println(plaka + " plakalı araç oto galeride yok.");
            }else{
                System.out.println(plaka + " plakalı aracın bilgileri : ");
                System.out.println("Marka           : "  + temp2.marka);
                System.out.println("Model           : "  + temp2.model);
                System.out.println("Renk            : "  + temp2.renk);
                System.out.println("Alış Fiyatı     : "  + temp2.alisFiyat);
                System.out.println("Satış Fiyatı    : "  + temp2.satisFiyat);
                System.out.println("Açıklama        : "  + temp2.aciklama);
            }
        }
    }
}
