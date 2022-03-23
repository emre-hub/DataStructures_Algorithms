package DataStructures_Algorithms.Stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the StackYapisi : ");
        int n = sc.nextInt();
        StackStructure stack = new StackStructure(n);
        int secim = -1, sayi;

        while(secim != 0){
            System.out.println("1- Push");
            System.out.println("2- Pop");
            System.out.println("3- Show the top element");
            System.out.println("4- Print all stack");
            System.out.println("0- Exit");
            System.out.println("Your choose : "); secim = sc.nextInt();

            switch (secim){
                case 1 : System.out.println("Data : "); sayi = sc.nextInt(); stack.push(sayi); break;
                case 2 : stack.pop(); break;
                case 3 : stack.showTop(); break;
                case 4 : stack.print(); break;
                case 0 : System.out.println("The program has been terminated."); break;
                default: System.out.println("Wrong Selection!"); break;
            }
        }
    }
}
