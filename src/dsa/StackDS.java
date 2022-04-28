package dsa;

import java.util.Stack;

public class StackDS {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.push("Robert Frost");
        books.push("William Carlos Williams");
        books.add(books.size()-1, "Emily Dickenson");
        books.push("Edger Allen Poe");
        System.out.println(books);
        books.push("Rumi");
        books.pop();
        books.push("Khalil Gibran");
        System.out.println(books);
    }
}
