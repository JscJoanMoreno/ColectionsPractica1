package Book;

import java.util.ArrayList;

public class BookManager {
    private ArrayList<Book> books = new ArrayList<>();
    public void addBook(Book book){
        books.add (book);
    }
    public ArrayList<Book> AllBooks(){
        ArrayList<Book> listOfAllBooks = new ArrayList<>();
        for (Book book : books){
            books.add(book);
        }
        return listOfAllBooks;
     }
     public Book returnBookWithTitle (String title){
        Book foundBook = null;
        for (Book b : books){
            if (b.getTitle().equals(title)){
                foundBook= b;
            }
     }
        return foundBook;
    }
    public Book returnBookWithAuthor (String author){
        Book foundBook = null;
        for (Book b : books){
            if (b.getAuthor().equals(author)){
                foundBook = b;

            }
        }
        return foundBook;
    }
    public void updateRating (int rating, String title) {
        if (rating > 5 || rating < 0) {
            System.out.println("El numero ha de estar entre 0-5");;
        } else {
            for (Book b : books) {
                if (b.getTitle().equals(title)) {
                    b.setRating(rating);
                    System.out.println("Actualitzat amb exit! :)");
                }
            }
        }
    }
    public ArrayList<Book> showByRatingDecresing(){
        ArrayList<Book> sortedRatings = books;
        sortedRatings.sort(Book.booksCompararPerRatingDecreixent);
        return sortedRatings;
    }
    public ArrayList<Book> showListOfBetterBooks (int quantitat){
        ArrayList<Book>foundBooks = new ArrayList<>();
        for (int i = 0; i < quantitat; i++){
            foundBooks.add(showByRatingDecresing().get(i));
        }
        return foundBooks;
    }
    public ArrayList<Book> BoockBettersThanMin (int minRating){
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book: books){
            if (book.getRating()>minRating){
                foundBooks.add(book);
            }  
        }
        return foundBooks;
    }
    public void deleteBook (int id){
        Book deleteBook = null;
        for (Book b: books){
            if (b.getId() == id){
                books.remove(b);
                System.out.println("llibre eliminat amb exit:=)");
            }
        }
    }
}
