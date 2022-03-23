package DataStructures_Algorithms.CiftYonluBagliListe_MusteriKayitUygulamasi;

public class CustomerNode {
    int id;
    String name;
    String surname;
    String tel;
    String adress;
    String product;

    CustomerNode next;
    CustomerNode prev;

    public CustomerNode(int id, String name, String surname, String tel, String adress, String product) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.tel = tel;
        this.adress = adress;
        this.product = product;
        next = null;
        prev = null;
    }
}
