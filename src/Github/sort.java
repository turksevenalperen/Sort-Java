package GithupÖdevi8;

import java.util.Stack;

public class sort {
    public static void main(String[] args) {
        // String array should be defined correctly with the correct syntax
        String[] data = {"Adana", "Bartin", "Kayseri", "Malatya", "Zonguldak"};
        
        // Corrected the creation of the Stack
        Stack<String> stack = new Stack<>();
        
        // Print if the stack is empty
        System.out.println(stack.isEmpty());
        
        // Push "Ankara" onto the stack
        stack.push("Ankara");
        System.out.println("stack: " + stack);
        
        // Push each element from the data array onto the stack
        for (String str : data) {
            stack.push(str);
        }
        
        // Print the stack, its size, and the top element
        System.out.println("stack: " + stack);
        System.out.println("size: " + stack.size());
        System.out.println("peek: " + stack.peek());
        
        // Pop an element from the stack and print the stack
        System.out.println("pop: " + stack.pop());
        System.out.println("stack: " + stack);
        
        // Pop all elements from the stack and print them
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
