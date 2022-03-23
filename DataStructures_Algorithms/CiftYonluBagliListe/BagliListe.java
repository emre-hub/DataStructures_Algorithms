package DataStructures_Algorithms.CiftYonluBagliListe;

public class BagliListe {
    //Çift Yönlü Doğrusal Bağlı Liste
    //Bu veriyapısında Head'den Tail'e gidebildiğimiz gibi, tam tersi yönde de ilerleyebiliriz.

    Node head = null;
    Node tail = null;

    void basaEkle(int data){
        Node eleman = new Node(data);

        if(head == null){
            head = eleman;
            tail = eleman;
        }else{
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
        }
    }

    void sonaEkle(int data){
        Node eleman = new Node(data);

        if(head == null){
            head = eleman;
            tail = eleman;
        }else{
            tail.next = eleman;
            eleman.prev = tail;
            tail = eleman;
        }
    }

    void arayaEkle(int index, int data){
        Node eleman = new Node(data);

        if(head == null){
            head = eleman;
            tail = eleman;
        }else if( index == 0){
            basaEkle(data);
        }else{
            int n = 0;
            Node temp = head;
            while(temp != null){
                temp = temp.next;
                n++;
            }
            temp = head;
            if( index > n ){//ekleme sona yapılacaksa..
                sonaEkle(data);
            }else{
                int i = 0;
                while(i != index){
                    temp = temp.next;
                    i++;
                }//bu döngü sonucunda temp node'um, indexteki node
                //çift yönlü linkedlist'te yeni node'um olan elemanı, listteki indexe yerleştirerek araya sıkıştırdığım kısım burası  :
                eleman.prev = temp.prev;
                temp.prev.next = eleman;
                eleman.next = temp;
                temp.prev = eleman;
            }
        }
    }

    void bastanSil(){
        if (head != null){
            if(head.next == null){
                head = null;
                tail = null;
            }else{
                head = head.next;
                head.prev = null;
            }
        }
    }

    void sondanSil(){
        if (head != null){
            if(head.next == null){
                head = null;
                tail = null;
            }else{
                tail = tail.prev;
                tail.next = null;
            }
        }
    }

    void aradanSil(int index){
        if (head != null){
            if(head.next == null && index <= 0){
                head = null;
                tail = null;
            }else if(head.next != null && index <= 0){
                bastanSil();
            }else{
                int n = 0;
                Node temp = head;
                while(temp != null){
                    n++;
                    temp = temp.next;
                }
                if( index >= (n-1) ){ //silinecek indis listenin sonuna ulaşmışsa...
                    sondanSil();
                }else{ //kullanıcının girdiği indexe gidip, silme işlemini yaptığım kısım
                    temp = head;
                    int i = 0;
                    while ( i < index ){
                        i++;
                        temp = temp.next;
                    }
                    temp.next.prev = temp.prev; //temp = silinecek indexteki node
                    temp.prev.next = temp.next;

                }
            }
        }
    }

    void yazdir(){
        Node temp = head;
        System.out.print ("Baş  | ");
        while( temp != null ){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(" |  Son");
    }

    void sondanYazdir(){
        Node temp = tail;
        System.out.print ("Son  | ");
        while( temp != null ){
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println("  |  Baş");
    }
}
