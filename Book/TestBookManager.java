package Book;

import com.sun.source.tree.LambdaExpressionTree;

import java.util.Scanner;

public class TestBookManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookManager manager = new BookManager();
        Book book1 = new Book(1, "La formiga","Jordi Creus",4);
        Book book2 = new Book(2,"The tree body problems", "Juanchi Snalha",9);
        Book book3 = new Book(1, "ABC","Salma Creus",8);
        Book book4= new Book(2,"The four body Problems", "Alba Garrido",5);
        Book book5 = new Book(1, "EEUU","Greenwod",6);

        manager.addBook(book1);
        manager.addBook(book2);
        manager.addBook(book3);
        manager.addBook(book4);
        manager.addBook(book5);

        System.out.println("Llibres afegits amb exit");

        System.out.println("llsita amb tots els llibres");

        for (Book b : manager.AllBooks()){
            System.out.println(b);

        }
        System.out.println("\nCercant llibre amb títol '1984':");
        System.out.println(manager.returnBookWithTitle("1984"));

        System.out.println("\nCercant llibre de 'Jane Austen':");
        System.out.println(manager.returnBookWithAuthor("Jane Austen"));

        System.out.println("\nActualitzant la puntuació de '1984' a 5");
        manager.updateRating(5, "1984");

        System.out.println("\nLlibres ordenats per rating decreixent:");
        for (Book b : manager.showByRatingDecresing()) {
            System.out.println(b);
        }

        System.out.println("\nMostrant els 3 millors llibres:");
        for (Book b : manager.showListOfBetterBooks(3)) {
            System.out.println(b);
        }


        System.out.println("\nLlibres amb puntuació superior a 3:");
        for (Book b : manager.BoockBettersThanMin(3)) {
            System.out.println(b);
        }


        System.out.println("\nEliminant el llibre amb ID 2");
        manager.deleteBook(2);

        System.out.println("\nLlistat final de llibres després de l'eliminació:");
        for (Book b : manager.AllBooks()) {
            System.out.println(b);
        }
    }
}


