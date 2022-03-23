package DataStructures_Algorithms.Queue_Stack_Palindrome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        StackYapisi st = new StackYapisi(100);
        QueueYapisi qu = new QueueYapisi(100);

        String kelime;

        System.out.println("Kelime girin : "); kelime = sc.nextLine();
        char[] harfler = kelime.toCharArray();

        int n = kelime.length();
        int i = 0;

        while(i < n){
            st.push(harfler[i]);
            qu.enQueue(harfler[i]);

            i++;
        }

        boolean sonuc = true;

        while( !st.isEmpty() ){
            if(st.pop() != qu.deQueue()){
                sonuc = false;
                break;
            }
        }

        if(sonuc)
            System.out.println("\n**\n" +kelime+ "\n**\nKelimesi Palindrome'dur!");
        else
            System.out.println("\n**\n" +kelime+ "\n**\nKelimesi Palindrome değildir.");

    }
}
