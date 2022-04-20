package oopsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyBooks {
    public static void main(String[] args) {
        Book book1 = new Book("Dune", "Frank Herbert",1965, 2.8f);
        Book book2 = new Book("Watchers", "Dean Koontz",1982, 3.7f);
        Book book3 = new Book("Gone Girl", "Gillian Flynn",2015, 4.8f);
        Book book4 = new Book("Game of Thrones", "George R. R. Martins",1996, 4.6f);
        Book book5 = new Book("Misery", "Stephen King",1987, 5f);
        Book book6 = new Book("It", "Stephen King",1986, 4.0f);
        Book book7 = new Book("Latitudes of Longing", "Subhangi Swaroop",2018, 4.1f);
        Book book8 = new Book("Wuthering Heights", "Emily Bronte",1847, 4.5f);
        Book book9 = new Book("The Alchemist", "Paolo Coelho",1988, 5f);
        Book book10 = new Book("And then there were none", "Aigatha Christie",1937, 5f);


        //making a list of type book of all book info
        List<Book> books = new ArrayList<>(Arrays.asList( new Book[]{
                book1, book2, book3, book4, book5, book6, book7, book8, book9, book10}
        ));

        //collecting all the titles to one list
        List<String> listOfBooks = books.stream().
                map((Book b)-> b.getTitle()).
                collect(Collectors.toList());

        System.out.println(listOfBooks);
    }
}
