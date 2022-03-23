package DataStructures_Algorithms.CiftYonluDaireselBagliListe_OtoparkUygulamasi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BagliListe { //Çift Yönlü Dairesel LinkedList
    Scanner sc = new Scanner(System.in);
    OtoNode head = null;
    OtoNode tail = null;
    OtoNode temp = head;
    OtoNode temp2 = temp;
    String plaka;
    String giris;
    String cikis;
    long dakika;
    long ucret;
    long toplamUcret = 0;

    void ekle(){
        System.out.print("Plaka : "); plaka = sc.nextLine();
        System.out.print("Giriş (ss:dd) : "); giris = sc.nextLine();

        OtoNode arac = new OtoNode(plaka, giris);
        if(head == null){
            head = arac;
            tail = arac;
            head.next = tail;
            head.prev = tail;
            tail.next = head;
            tail.prev = head;
            System.out.println("Araç otoparka girdi.");
        }else{
            arac.next = head;
            head.prev = arac;
            head = arac;
            head.prev = tail;
            tail.next = head;
            System.out.println("Araç otoparka girdi.");
        }
    }

    void sil() throws ParseException {
        if(head == null){
            System.out.println("Otopark boş.");
        }else{
            System.out.print("Plaka : "); plaka = sc.nextLine();
            System.out.print("Çıkış (ss:dd) : "); cikis = sc.nextLine();

            if(head == tail && head.plaka.equals(plaka)){
                ucretHesapla(head, cikis);
                head = null;
                tail = null;
                System.out.println("Araç çıkışı yapıldı.");
            }
            else if(head != tail && head.plaka.equals(plaka)){
                ucretHesapla(head, cikis);
                head = head.next;
                head.prev = tail;
                tail.next = head;
                System.out.println("Araç çıkışı yapıldı.");
            }else{
                temp = head;
                while(temp != tail){
                    if(temp.plaka.equals(plaka)){
                        ucretHesapla(temp, cikis);
                        temp2.next = temp.next;
                        temp.next.prev = temp2;
                        System.out.println("Araç çıkışı yapıldı.");
                    }
                    temp2 = temp;
                    temp = temp.next;
                }
                if(temp.plaka.equals(plaka)){
                    ucretHesapla(temp, cikis);
                    tail = temp2;
                    tail.next = head;
                    head.prev = tail;
                    System.out.println("Araç çıkışı yapıldı.");
                }
            }
        }
    }

    void ucretHesapla(OtoNode temp, String cikis) throws ParseException {
        giris = temp.giris;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        Date d1, d2;
        d1 = sdf.parse(giris);
        d2 = sdf.parse(cikis);

        dakika = d2.getTime() - d1.getTime();
        dakika = dakika/60000;
        ucret = dakika / 4;
        System.out.println("Süre : " + dakika + " dk.");
        System.out.println("Ücret : " + ucret + " TL");
        toplamUcret += ucret;
    }

    void yazdir(){
        if(head == null){
            System.out.println("Otoparkta Araç Yok");
        }else{
            System.out.println("Plaka\t\tGiriş Saati");
            temp = head;
            while(temp != tail){
                System.out.println(temp.plaka + "\t\t" + temp.giris);
                temp = temp.next;
            }
            System.out.println(temp.plaka + "\t\t" + temp.giris + "\n");
        }
    }
}
