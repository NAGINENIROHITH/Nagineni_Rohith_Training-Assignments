package Java_Assignment4;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack Elements: " + stack);

        // Peek() → view top element
        System.out.println("Top Element (peek): " + stack.peek());

        // Pop() → remove top element
        System.out.println("Popped Element: " + stack.pop());

        System.out.println("Stack after pop: " + stack);

        // Check if empty
        System.out.println("Is Stack Empty? " + stack.empty());
    }
}

