package DataStructures_Algorithms.Recursion;

public class Main {
    public static void main(String[] args) {
        //dogalSayilariYazdir(5);
        //System.out.println(sayilariTopla(5));
        //System.out.println(fibonacci(10));

        //int[] arr = {1,2,3,4,5};
        //System.out.println(arrayElemanlariniGez(arr, 0));
        //System.out.println(numberOfDigits(321234550,0));

        //System.out.println(sumOfDigits(543));

        //int[] arr = {23,46,2,15,88,9,44,0,1,5,27,16,44,55};
        //System.out.println(largestElementOnArray(arr,0, 0));

        //System.out.println(factorial(5));
        //decimalToBinary(66);
    }

    public static int dogalSayilariYazdir(int sayi){
        //fonksiyona girilen sayıdan, 50'ye kadar olan doğal sayıları yazdırır
        if(sayi > 50 || sayi < 1)
            return 1;
        System.out.println(sayi);
        return 1 + dogalSayilariYazdir(sayi+1);
    }

    public static int sayilariTopla(int n){
        //1'den n'e kadar olan sayıları toplar
        if(n <= 1){
            return 1;
        }
        return n + sayilariTopla(n-1);
    }

    public static int fibonacci(int sayi){
        if(sayi > 20 || sayi < 1)
            return 0;
        else if(sayi == 1)
            return 1;
        else
            return fibonacci(sayi-1) + fibonacci(sayi-2);
    }

    public static int arrayElemanlariniGez(int arr[], int index){
        if(index >= arr.length-1 || index < 0)
            return arr[arr.length-1];
        System.out.println(arr[index]);
        return  arrayElemanlariniGez(arr, index+1);
    }

    public static int numberOfDigits(int num, int curr){
        if(num != 0){
            return numberOfDigits(num/10, curr+1);
        }
        return curr;
    }

    public static int sumOfDigits(int num){
        if(num == 0 ){
            return 0;
        }
        return(num % 10 + sumOfDigits(num / 10));
    }

    public static int largestElementOnArray(int[] arr, int index, int max){
        if(index > arr.length-1){
            return max;
        }
        if(arr[index] > max)
            return largestElementOnArray(arr, index+1, arr[index]);
        else
            return largestElementOnArray(arr, index+1, max);
    }

    public static int factorial(int num){
        if(num == 1)
            return 1;
        return num * factorial(num-1);
    }

    public static void decimalToBinary(int num) {
        if(num > 0){
            decimalToBinary(num/2);
            System.out.print(num%2);
        }
    }

    public static int prime(int num){ //recursive
        //Expected Output : The number 7 is a prime number.
        return 1;
    }


    public static void evenAndOdd(int from, int to){


    }
}
