package DataStructures_Algorithms.HashTable.OgrenciKayitUygulamasi;

public class Table {
    Ogrenci dizi[];
    int size;

    public Table(int size){
        this.size = size;
        dizi = new Ogrenci[size];
        for(int i = 0; i < size; i++){
            dizi[i] = new Ogrenci();
        }
    }

    int indexUret(int key){
        return key % size;
    }

    void ekle(int numara, String ad, int ort){ //add
        int index = indexUret(numara);

        Ogrenci ogr = new Ogrenci(numara, ad, ort);
        Ogrenci temp = dizi[index];
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = ogr;
        System.out.println(ad + " eklendi.");
    }

    void sil(int numara){ //delete
        boolean isFound = false;
        int index = indexUret(numara);

        Ogrenci temp = dizi[index];
        Ogrenci temp2 = temp;

        if(temp.next == null){
            isFound = true;
            System.out.println(numara +" numaralı öğrenci bulunamadı.");
        }else if(temp.next.next == null && temp.next.numara == numara){ //numara, bulunduğu indexteki tek eleman ise...
            isFound = true;
            temp.next = null;
            System.out.println(numara + " numaralı öğrenci silindi.");
        }else{ //dizide birden fazla eleman varsa...
            isFound = true;
            while(temp.next != null){
                temp2 = temp;
                temp = temp.next;
                if(temp.numara == numara){
                    temp2.next = temp.next;
                    System.out.println(numara + " numaralı öğrenci silindi.");
                }
            }
        }
        if(!isFound)
            System.out.println(numara + " numaralı öğrenci kaydı bulunamadı.");
    }

    void yazdir(){ //print
        System.out.println("|Numara|\t\t" + "|Ad|\t\t" + "|Ort|\t\t" + "|Durum|");
        for(int i = 0; i < size; i++){
            Ogrenci temp = dizi[i];
            while (temp.next != null){
                System.out.println(temp.next.numara + "\t\t\t" + temp.next.ad + "\t\t\t" + temp.next.ort + "\t\t\t" + temp.next.durum);
                temp = temp.next;
            }
        }
    }

    void ara(int numara){
        boolean isFound = false;
        int index = indexUret(numara);
        Ogrenci temp = dizi[index];
        while(temp.next != null){
            if(temp.next.numara == numara){
                System.out.println(numara + " numaralı öğrencinin bilgileri : ");
                System.out.println("Ad       :  " + temp.next.ad);
                System.out.println("Ortalama :  " + temp.next.ort);
                System.out.println("Durum    :  " + temp.next.durum);
                isFound = true;
                break;
            }
            temp = temp.next;
        }
        if(!isFound){
            System.out.println(numara + " numaralı öğrenci bulunamadı.");
        }
    }







}
