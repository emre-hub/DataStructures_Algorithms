package DataStructures_Algorithms.Stack_withArrays;

public class Main {
    public static void main(String[] args) {
        Stack_Yigin stack = new Stack_Yigin(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println( stack.pop() );
        System.out.println(stack.isFull());
        stack.push(21);
        stack.push(22);
        System.out.println( stack.pop() );
        System.out.println( stack.pop() );
        System.out.println( stack.pop() );
    }
}
