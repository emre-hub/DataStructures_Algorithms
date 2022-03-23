package DataStructures_Algorithms.Stack_KursKayitUygulamasi;

import java.util.Scanner;

public class KursStack {
    Scanner sc = new Scanner(System.in);
    KursNode top;

    int kontenjan;
    int sayac;

    public KursStack(int kontenjan) {
        this.kontenjan = kontenjan;
        this.sayac = 0;
        top = null;
    }

    String tc;
    String ad;
    String soyad;
    String mezunBolum;

    void ekle(){ //push
        if( isFull() ){
            System.out.println("Kurs kontenjanı dolu, yeni kayıt alamıyoruz.");
        }else{
            System.out.println("Kursa kayıt edilecek kişinin bilgilerini giriniz : ");
            System.out.print("TC no              : "); tc = sc.nextLine();
            System.out.print("Ad                 : "); ad = sc.nextLine();
            System.out.print("Soyad              : "); soyad = sc.nextLine();
            System.out.print("Mezun olduğu bölüm : "); mezunBolum = sc.nextLine();
            System.out.println();

            KursNode eleman = new KursNode(tc, ad, soyad, mezunBolum);

            if( isEmpty() ){
                top = eleman;
                System.out.println(top.tc + " numaralı kişi kursa ilk kayıt olarak eklendi.");
            }else{
                eleman.next = top;
                top = eleman;
                System.out.println(top.tc + " numaralı kişi kursa kayıt olarak eklendi.");
            }
            sayac++;
        }
    }

    void sil(){ //pop
        if( isEmpty() )
            System.out.println("Kursa kayıtlı kimse yok.");
        else{
            System.out.println("Kurstan " + top.tc +  " numaralı kişinin kaydı silindi.");
            top = top.next;
            sayac--;
        }
    }

    void yazdir(){
        if(isEmpty())
            System.out.println("Kursta kayıtlı kimse yok.");
        else{
            KursNode temp = top;
            System.out.println("Kursta kaydı olan kişilerin listesi        :  ");
            System.out.println("TCNo - \t Ad - \t Soyad - \t - Mezun Olduğu Bölüm");
            while(temp != null){
                System.out.println("---------------------------------------------------------------------");
                System.out.println( temp.tc + "\t" + temp.ad + "\t" + temp.soyad + "\t" + temp.mezunBolum);
                System.out.println("---------------------------------------------------------------------");
                temp = temp.next;
            }
        }
    }

    void enSonKayitOlanKisi(){ //top
        if( isEmpty() ){
            System.out.println("Kursta kayıtlı kimse yok.");
        }else{
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Kursa en son kayıt olan kişinin bilgileri  : ");
            System.out.println( top.tc + "\t" + top.ad + "\t" + top.soyad + "\t" + top.mezunBolum);
            System.out.println("---------------------------------------------------------------------");
        }
    }

    void kalanKontenjanSayisi(){
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Kayıtlı kişi sayısı                            : " + sayac);
        System.out.println("Kalan kontenjan                                : " + (this.kontenjan - sayac) );
        System.out.println("---------------------------------------------------------------------");
    }

    private boolean isFull() {
        return sayac == kontenjan;
    }

    private boolean isEmpty() {
        return sayac == 0;
    }
}
