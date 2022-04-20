package oopsPractice;

import java.util.ArrayList;

import java.util.List;

public class LMSbooks {

}
class Author{

    private String firstName;
    private String LastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        LastName = lastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
class Books{
    private String title;
    private Author author;

    public Books(String title, Author author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<String> firstNameOfAuthors(Author... authors){
        List<String> firstNames = new ArrayList<>();
        for (int i=0;i<authors.length;i++){
            firstNames.add(authors[i].getFirstName());
        }
        return firstNames;
    }
    public List<String> titlesOf(Book... books){
        List<String> titles = new ArrayList<>();
        for (int i=0;i<books.length;i++){
            titles.add(books[1].getTitle());
        }
        return titles;
    }
}