package Task09;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    @Override
    public String toString() {
        return stack.toString();
    }

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        int x = stack.size() - 1;
        T element = stack.get(x);
        stack.remove(x);
        return element;
    }

    public T peek() {
        return stack.get(stack.size() - 1);
    }

    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("10");
        stack.push("11");
        stack.push("12");
        stack.push("13");
        System.out.println(stack);
        System.out.println(stack.size());

        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack);
    }
}
