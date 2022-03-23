package DataStructures_Algorithms.TekYonluBagliListe;

public class TekYonluListeYapisi {
    Node head = null;
    Node tail = null;

    void basaEkle ( int x ){
        Node eleman = new Node();
        eleman.data = x;
        if(head == null){
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("Liste yapısı oluşturuldu, ilk eleman eklendi.");
        }else{
            eleman.next = head; //başa eklenen değer headi gösteriyor, buradaki head birazdan ikinci eleman olacak.
            head = eleman; // Yeni head'im, eski head'i gösteren, listemdeki ilk eleman oldu.
            System.out.println("Başa eleman eklendi.");
        }
    }

    void sonaEkle ( int x ){
        Node eleman = new Node();
        eleman.data = x;

        if(head == null){
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("Liste yapısı oluşturuldu, ilk eleman eklendi.");
        }else{
            eleman.next = null; //yeni tail'im olan eleman, null değer göstermeli.
            tail.next = eleman; //Listedeki son eleman yani kuyruk (tail) , listenin sonuna eklenen yeni elemanı, yani yeni kuyruğu gösteriyor.
            tail = eleman; // ismi güncelliyorum.
            System.out.println("Sona eleman eklendi.");
        }
    }

    void arayaEkle (int index, int x){
        Node eleman = new Node();
        eleman.data = x;

        if(head == null & index == 0){
            eleman.next = null;
            head = eleman;
            tail = eleman;
            System.out.println("Liste yapısı oluşturuldu, ilk eleman eklendi.");
        }else if(head != null && index == 0){
            eleman.next = head; //başa eklenen değer headi gösteriyor, buradaki head birazdan ikinci eleman olacak.
            head = eleman; // Yeni head'im, eski head'i gösteren, listemdeki ilk eleman oldu.
            System.out.println(index + " . indexe eleman eklendi.");
        }else{
            int n = 0;
            Node temp = head;
            Node temp2 = head;

            while (temp.next != null) {
                n++;
                temp2 = temp;
                temp = temp.next;
            }
            if ( n == index ){
                temp2.next = eleman;
                eleman.next = temp;
                System.out.println("Eleman eklendi.");
            }else{
                temp = head;
                temp2 = head;
                int i = 0;
                while (i < index){
                    temp2 = temp;
                    temp = temp.next;
                    i++;
                }
                temp2.next = eleman;
                eleman.next = temp;
                System.out.println(index + " . sıraya yeni eleman eklendi. ");
            }

        }
    }

    void bastanSil(){
        if(head == null){
            System.out.println("Liste boş.");
        }else if( head.next == null){
            head = null;
            tail = null;
            System.out.println("Listede kalan son eleman da silindi.");
        }else{
            head = head.next;
            System.out.println("Baştaki eleman silindi.");
        }
    }

    void sondanSil(){
        if(head == null){
            System.out.println("Liste boş.");
        }else if( head.next == null){
            head = null;
            tail = null;
            System.out.println("Listede kalan son eleman da silindi.");
        }else{
            Node temp = head;
            Node temp2 = head;
            while(temp.next != null){
                temp2 = temp;
                temp = temp.next; //temp sıradakine geçerken, temp2 eski temp'in bilgisini tutuyor. Tailden bir önceki elemana ulaşmak için bu yöntemi uyguluyorum.
            }
            temp2.next = null;
            tail = temp2;
            System.out.println("Sondan eleman silindi.");
        }
    }

    void aradanSil(int index){

        if( head == null ){
            System.out.println("Liste boş.");
        }else if( head.next == null && index == 0 ){ //listedeki son elemanı da silmek istediğimde
            head = null;
            tail = null;
            System.out.println("Listede kalan son eleman da silindi.");
        }else if (head.next != null && index == 0 ){ //head'i silmek istediğimde
            head = head.next;
            System.out.println("Baştaki eleman silindi.");
        }else{

            int i = 0;
            Node temp = head;
            Node temp2 = head;

            while(temp != null){ //kuyruğa kadar gidiyoruz
                i++;
                temp2 = temp; //Tail'den önceki düğümü tutmak için, temp bir sonraki değere geçmeden önce onun değerini temp2'ye atarım.
                temp = temp.next;
            }

            if( i == index){ //bu kısma geldiysek, index değeri tail'dir, listenin sonudur. Son elemanı bir öncekine atayarak kuyruğu kesiyoruz.
                temp2.next = null;
                tail = temp2;
                System.out.println("Listenin son elemanı silindi.");
            }else{
                temp = head;
                temp2 = head;
                int j = 0;
                while( j != index){
                    j++;
                    temp2 = temp;
                    temp = temp.next;
                }
                temp2.next = temp.next;
                System.out.println("Aradaki eleman silindi.");
            }
        }
    }

    void yazdir (){
        if(head == null){
            System.out.println("Liste yapısı boş.");
        }else{
            Node temp = head;
            System.out.print("Start | ");
            while ( temp != null){
                System.out.print(temp.data + " - > ");
                temp = temp.next;
            }
            System.out.println(" | End.");
        }
    }
}
