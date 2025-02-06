import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class NotesDAM {
    public static ArrayList<Integer> introdueixValors() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> notes = new ArrayList<>();
        int nota;

        System.out.println("Introdueix les notes (introdueix -1 per acabar):");
        while (true) {
            nota = sc.nextInt();
            if (nota == -1) {
                break;
            }
            notes.add(nota);
        }

        return notes;
    }
    public static int sumaValorsAmbIterator(ArrayList<Integer> notes) {
        Iterator<Integer> iterator = notes.iterator();
        int suma = 0;

        while (iterator.hasNext()) {
            suma += iterator.next();
        }

        return suma;
    }

    public static int sumaValorsSenseIterator(ArrayList<Integer> notes) {
        int suma = 0;

        for (Integer nota : notes) {
            suma += nota;
        }

        return suma;
    }

    public static void main(String[] args) {
        ArrayList<Integer> notes = introdueixValors();

        if (notes.isEmpty()) {
            System.out.println("No hi ha notes introduïdes.");
        } else {
            int sumaAmbIterator = sumaValorsAmbIterator(notes);
            int sumaSenseIterator = sumaValorsSenseIterator(notes);

            double mitjana = (double) sumaAmbIterator / notes.size();

            System.out.println("La suma de les notes amb Iterator és: " + sumaAmbIterator);
            System.out.println("La suma de les notes sense Iterator és: " + sumaSenseIterator);
            System.out.println("La mitjana aritmètica és: " + mitjana);
        }
    }
}
