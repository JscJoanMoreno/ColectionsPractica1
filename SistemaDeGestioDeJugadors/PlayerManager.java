package SistemaDeGestioDeJugadors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class PlayerManager {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Player> players = new ArrayList<>();

    // 1
    public void addPlayer(Player player) {
        players.add(player);
    }

    // 2
    public void deletePlayerByName(String name) {
        Iterator<Player> iterator = players.iterator();
        while (iterator.hasNext()) {
            Player currentPlayer = iterator.next();
            if (Objects.equals(currentPlayer.getName(), name)) {
                iterator.remove();
                return;
            }
        }
    }

    // 3
    public Player returnPlayerByName(String name) {
        for (Player player : players) {
            if (Objects.equals(player.getName(), name)) {
                return player;
            }
        }
        return null;
    }

    // 4
    public Player updateScore(int score, String name) {
        for (Player player : players) {
            if (Objects.equals(player.getName(), name)) {
                player.setScore(score);
                return player;
            }
        }
        return null;
    }
    // 5
    // 6

    public ArrayList<Player> listBetterPlayers(int minScore) {
        ArrayList<Player> betterPlayers = new ArrayList<>();
        for (Player player: players){
            if (player.getScore() > minScore){
                betterPlayers.add(player);
            }
        }
        return betterPlayers;
    }
    // 8
    public Player bestPlayer (){

        Player bestPlayer = players.get(0);
        for (Player player: players){
            if (player.getScore()> bestPlayer.getScore()){
                bestPlayer = player;
            }
        }
        return  bestPlayer;
    }
    // 9

    public ArrayList<Player> showAllPlayers(){
        ArrayList<Player> listOfAllPlayers = new ArrayList<>();
        listOfAllPlayers.addAll(players);

        return listOfAllPlayers;
    }
}
