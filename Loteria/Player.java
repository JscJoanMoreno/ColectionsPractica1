package Loteria;

import java.util.HashSet;
import java.util.Random;

public class Player {
    String dni;
    HashSet<Integer> ticket;

    public Player(String dni) {
        this.dni = dni;
        this.ticket = generateTicket();
    }

    private HashSet<Integer> generateTicket() {
        Random rand = new Random();
        HashSet<Integer> ticket = new HashSet<>();
        while (ticket.size() < 4) {
            ticket.add(rand.nextInt(101));
        }
        return ticket;
    }

    public boolean hasWon(HashSet<Integer> drawnNumbers) {
        return drawnNumbers.containsAll(this.ticket);
    }
}
