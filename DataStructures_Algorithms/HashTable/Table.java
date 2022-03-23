package DataStructures_Algorithms.HashTable;

public class Table {
    Node dizi[];
    int size;

    public Table(int size){
        this.size = size;
        dizi = new Node[size];
        for(int i = 0; i < size; i++){ //başlangıçta diziyi oluştururken, dizinin her indisine boş birer Ogrenci atıyorum.
            dizi[i] = new Node(); //Bu Ogrenci'lar daha sonra ekleyeceğim elemanları gösterecek.
        }
    }

    int indexUret(int key){ //key'in, dizi boyutuna göre modunu alarak, dizinin hangi indisine yerleşeceğini belirleyeceğim
        return key % size;
    }

    void ekle(int key, String isim){
        int index = indexUret(key);
        Node eleman = new Node(key, isim);

        Node temp = dizi[index]; //elemanı yerleştireceğim indexteki ilk node'a giderim
        while(temp.next != null){//node'un nexti gösterdiği yere kadar giderim
            temp = temp.next;
        }
        temp.next = eleman; //ilgili linkedlist'in sonuna elemanı eklerim
        System.out.println(eleman.isim + " eklendi.");
    }

    void sil(int key){//sileceğim elemanın key'ini parametre olarak alacağım
        int index = indexUret(key); //indexUret() fonksiyonumu, sileceğim elemanın indexini bulmak için kullanıyorum
        Node temp = dizi[index];
        Node temp2 = dizi[index];

        if(temp.next == null){
            System.out.println(key + " numaralı kayıt bulunamadı.");
        }else if(temp.next.next == null && temp.next.key == key){
            System.out.println("Bu kısımdaki son kişi olan " + temp.next.isim + " silindi.");
            temp.next = null;
        }else{
            while (temp.next != null) {
                temp2 = temp;
                temp = temp.next;
                if(temp.key == key){
                    System.out.println(temp.isim + " silindi.");
                    temp2.next = temp.next;
                }
            }
        }
    }

    void yazdir(){
        for(int i = 0; i < size; i++){
            Node temp = dizi[i];
            System.out.print("Dizi[" + i + "]   >>>   ");
            if(temp.next != null){
                while(temp.next != null){
                    temp = temp.next;
                    System.out.print("(key: " + temp.key + ",value: " + temp.isim  + ")    ->    ");
                }
            }
            System.out.println(" null\n");
        }
    }
}
