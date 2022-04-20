package oopsPractice;

//custom exception if the rating is more than 5
class InvalidRatings extends Exception{
    public InvalidRatings(String msg)
    {
        super(msg);
    }
}

public class Book {
    private String title;
    private String author;
    private int yearOfPublishing;
    private float rating;

    //getters and setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getYearOfPublishing() {
        return yearOfPublishing;
    }
    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        //rating must be less than or equal to 5 or it throws the custom exception.
        try{
            if (rating<=5){
                this.rating = rating;
            } else {
                throw new RuntimeException("Maximum rating is 5");
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    //constructor
    public Book(String title, String author, int yearOfPublishing, float rating) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        setRating(rating);
    }

    public String toString(){
        return "Book info: [title: "+this.title+" author: "+this.author+" yearOfPublishing: "
                +this.yearOfPublishing+" rating: "+this.rating+"]";
    }
}
