package Book;

import java.util.Comparator;

public class Book {
    private int id;
    private String title;
    private String author;
    private int rating;

    public Book(int id, String title, String author, int rating) {
        this.id = id;
        this.title = title;
        this.author = author;
        if (rating > 5 || rating < 0){
            System.out.println("Ha de ser entre 0-5");
        }else this.rating = rating;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
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
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", rating=" + rating +
                '}';
    }
    public static Comparator<Book> booksCompararPerRatingDecreixent = new Comparator<Book>() {
        public int compare(Book a1, Book a2) {
            Integer bookRating1 = a1.getRating();
            Integer bookRating2 = a2.getRating();

            return bookRating2.compareTo(bookRating1);
        }};
    public static Comparator<Book> booksCompararPerRating = new Comparator<Book>() {
        public int compare(Book a1, Book a2) {
            Integer bookRating1 = a1.getRating();
            Integer bookRating2 = a2.getRating();

            return bookRating1.compareTo(bookRating2);
        }};
}

