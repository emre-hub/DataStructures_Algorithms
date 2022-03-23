package DataStructures_Algorithms.CiftYonluBagliListe_MusteriKayitUygulamasi;

import java.util.Scanner;

public class LinkedListStructure {
    Scanner sc = new Scanner(System.in);
    CustomerNode head = null;
    CustomerNode tail = null;

    int id;
    String name;
    String surname;
    String tel;
    String adress;
    String product;

    void add() {
        System.out.println("Müşterinin bilgilerini giriniz : ");
        System.out.println("Numarası   : ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Adı        : ");
        name = sc.nextLine();
        System.out.println("Soyadı     : ");
        surname = sc.nextLine();
        System.out.println("Telefonu   : ");
        tel = sc.nextLine();
        System.out.println("Adresi     : ");
        adress = sc.nextLine();
        System.out.println("Ürün       : ");
        product = sc.nextLine();

        CustomerNode element = new CustomerNode(id, name, surname, tel, adress, product);

        if (head == null) {
            head = element;
            tail = element;
            System.out.println("Liste oluşturuldu, ilk müşteri kayıt edildi.");
        } else {
            element.next = head;
            head.prev = element;
            head = element;
            System.out.println(id + " numaralı müşteri kayıt edildi.");
        }
    }

    void delete()  {
        boolean result = false;
        if (head == null)
            System.out.println("Müşteri listesi boş.");
        else {
            System.out.println("Silinecek Müşterinin numarasını giriniz : ");
            id = sc.nextInt();
            sc.nextLine();
            if (head.next == null && head.id == id) { //listede tek eleman varsa
                head = null;
                tail = null;
                System.out.println(id + " numaralı müşteri silindi.");
                result = true;
            } else if (head.next != null && head.id == id) { //silinecek eleman head ise baştan silme işlemi
                head = head.next;
                head.prev = null;
                System.out.println(id + " numaralı müşteri silindi.");
                result = true;
            } else if (tail.id == head.id) { //silinecek eleman tail ise sondan silme işlemi
                tail = tail.prev;
                tail.next = null;
                System.out.println(id + " numaralı müşteri silindi.");
                result = true;
            } else { //aradaki düğümün silineceği kısım
                CustomerNode temp = head;
                while (temp != null) {
                    if (temp.id == id) {
                        temp.next.prev = temp.prev;
                        temp.prev.next = temp.next;
                        System.out.println(id + " numaralı müşteri silindi.");
                        result = true;
                        break;
                    }
                    temp = temp.next;
                }
            }
            if (!result)
                System.out.println(id + " numaralı müşteri listede yok.");
        }
    }

    void update() {
        boolean result = false;
        if (head == null)
            System.out.println("Müşteri listesi boş.");
        else {
            System.out.println("Güncellenecek müşteri numarası : "); id = sc.nextInt();
            sc.nextLine();

            CustomerNode temp = head;
            while (temp != null) {
                if (temp.id == id) {
                    System.out.println(id + " numaralı müşteri bilgileri : ");
                    System.out.println("Ad      : " + temp.name);
                    System.out.println("Soyad   : " + temp.surname);
                    System.out.println("Telefon : " + temp.tel);
                    System.out.println("Adres   : " + temp.adress);
                    System.out.println("Ürün    : " + temp.product);

                    System.out.println("\n--Ürün Bilgisini Güncelleyiniz : ");
                    temp.product = sc.nextLine();
                    System.out.println("Ürün bilgisi güncellendi.");

                    result = true;
                    break;
                }
                temp = temp.next;
            }
            if (!result)
                System.out.println(id + " numaralı müşteri listede yok.");
        }
    }

    void customerSearch() {
        boolean result = false;
        if (head == null)
            System.out.println("Müşteri listesi boş.");
        else {
            System.out.println("Aradığınız müşteri numarası : "); id = sc.nextInt();
            sc.nextLine();

            CustomerNode temp = head;
            while (temp != null) {
                if (temp.id == id) {
                    System.out.println(id + " numaralı müşteri bilgileri : ");
                    System.out.println("Ad      : " + temp.name);
                    System.out.println("Soyad   : " + temp.surname);
                    System.out.println("Telefon : " + temp.tel);
                    System.out.println("Adres   : " + temp.adress);
                    System.out.println("Ürün    : " + temp.product);

                    result = true;
                    break;
                }
                temp = temp.next;
            }
            if (!result)
                System.out.println(id + " numaralı müşteri listede yok.");
        }
    }

    void printList(){
        if (head == null)
            System.out.println("Müşteri listesi boş.");
        else {
            System.out.println("Numara\t\tAd\t\tSoyad\t\tTelefon\t\tAdres\t\tÜrün Adı\n");
            CustomerNode temp = head;
            while (temp != null) {
                System.out.println(temp.id + "\t\t" + temp.name + "\t\t" + temp.surname + "\t\t" + temp.tel + "\t\t" + temp.adress + "\t\t" + temp.product + "\n");
                temp = temp.next;
            }
        }
    }
}