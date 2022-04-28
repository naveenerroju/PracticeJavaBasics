package dsa;

import java.util.Stack;

//STACKS FOLLOW 'FIRST IN FIRST OUT' ORDER

public class StackDS {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.push("Robert Frost");
        books.push("William Carlos Williams");
        books.add(books.size()-1, "Emily Dickenson");
        books.push("Edger Allen Poe");
        System.out.println(books);
        books.push("Rumi");
        System.out.println(books.pop()); //pop will remove and return the last element
        System.out.println(books.peek()); //returns the last element without removing
        books.push("Khalil Gibran");
        System.out.println(books);

        books.clear();
        System.out.println("the list is empty? "+books.empty());
    }
}
