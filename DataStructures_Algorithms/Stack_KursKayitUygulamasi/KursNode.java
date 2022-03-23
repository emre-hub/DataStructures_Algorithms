package DataStructures_Algorithms.Stack_KursKayitUygulamasi;

public class KursNode {
    String tc;
    String ad;
    String soyad;
    String mezunBolum;
    KursNode next;

    public KursNode(String tc, String ad, String soyad, String mezunBolum) {
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
        this.mezunBolum = mezunBolum;
        this.next = null;
    }
}
