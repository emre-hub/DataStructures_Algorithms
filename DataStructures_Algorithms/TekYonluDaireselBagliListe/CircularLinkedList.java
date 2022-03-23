package DataStructures_Algorithms.TekYonluDaireselBagliListe;

import java.util.Scanner;

public class CircularLinkedList {
    Scanner sc = new Scanner(System.in);
    Node head = null;
    Node tail = null;

    void prepend(){
        int data;
        System.out.println("Data : ");
        data = sc.nextInt();
        Node element = new Node(data);

        if(head == null){
            head = element;
            tail = element;
            tail.next = head;
        }else{
            element.next = head;
            head = element;
            tail.next = head;
        }
    }

    void addToEnd(){
        int data;
        System.out.println("Data : ");
        data = sc.nextInt();
        Node element = new Node(data);

        if(head == null){
            head = element;
            tail = element;
            tail.next = head;
        }else{
            tail.next = element;
            tail = element;
            tail.next = head;
        }
    }

    void insert(){
        int data, index;

        System.out.println("Index : ");
        index = sc.nextInt();
        System.out.println("Data : ");
        data = sc.nextInt();

        Node element = new Node(data);

        if(head == null){
            head = element;
            tail = element;
            tail.next = head;
        }else if(index == 0){
            element.next = head;
            head = element;
            tail.next = head;
        }else{
            int n = 0;
            Node temp = head;
            Node temp2 = head;
            while(temp != tail){
                temp = temp.next;
                n++;
            }
            n++;

            if(index >= (n)){ //add to end
                tail.next = element;
                tail = element;
                tail.next = head;
            }else{
                temp = head;
                temp2 = temp;
                int i = 0;
                while(i < index){
                    i++;
                    temp2 = temp;
                    temp = temp.next;
                }
                temp2.next = element;
                element.next = temp;
            }
        }
    }

    void removeFirst(){
        if(head == null)
            System.out.println("Liste boş.");
        else if(head == tail){
            head = null;
            tail = null;
        }else{
            head = head.next;
            tail.next = head;
        }
    }

    void removeLast(){
        if(head == null)
            System.out.println("Liste boş.");
        else if(head == tail){
            head = null;
            tail = null;
        }else{
            Node temp = head;
            while ( temp.next != tail){
                temp = temp.next;
            }
            tail = temp;
            tail.next = head;
        }
    }

    void remove(){
        if(head == null){
            System.out.println("Liste boş.");
        }else if(head == tail){
            head = null;
            tail = null;
        }else{
            int index;
            int n = 0;
            System.out.println("Index : ");
            index = sc.nextInt();
            sc.nextLine();

            Node temp = head;
            Node temp2 = temp;

            while ( temp != tail){
                temp = temp.next;
                n++;
            }n++;

            temp = head;
            int i = 0;
            while(i < index){
                temp2 = temp;
                temp = temp.next;
                i++;
            }
            temp2.next = temp.next;
        }
    }

    void print(){
        if(head == null){
            System.out.println("Liste boş");
        }else{
            Node temp = head;
            System.out.print("Baş | ");
            while(temp != tail){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println(temp.data + " | Son");
        }

    }
 }
