package Loteria;

import java.util.HashSet;
import java.util.Random;

public class Loteria {
    public static void main(String[] args) {
        HashSet<Integer> bag = new HashSet<>();
        for (int i = 0; i <= 100; i++) {
            bag.add(i);
        }

        Player player1 = new Player("12345678A");
        Player player2 = new Player("23456789B");
        Player player3 = new Player("34567890C");
        Player player4 = new Player("45678901D");

        Player[] players = {player1, player2, player3, player4};

        Random rand = new Random();
        HashSet<Integer> drawnNumbers = new HashSet<>();
        boolean winner = false;

        while (!winner) {
            Integer number = (Integer) bag.toArray()[rand.nextInt(bag.size())];
            drawnNumbers.add(number);
            bag.remove(number);

            System.out.println("Drawn number: " + number);

            for (Player player : players) {
                if (player.hasWon(drawnNumbers)) {
                    System.out.println("The winner is: " + player.dni);
                    winner = true;
                    break;
                }
            }
        }
    }
}
