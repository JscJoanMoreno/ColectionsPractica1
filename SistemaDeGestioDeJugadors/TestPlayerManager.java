package SistemaDeGestioDeJugadors;

import java.util.ArrayList;

public class TestPlayerManager {

    public static void main(String[] args) {
        TestPlayerManager test = new TestPlayerManager();
        test.testAddPlayer();
        test.testDeletePlayerByName();
        test.testReturnPlayerByName();
        test.testUpdateScore();
        test.testListBetterPlayers();
        test.testBestPlayer();
        test.testShowAllPlayers();
    }

    public void testAddPlayer() {
        PlayerManager playerManager = new PlayerManager();
        Player player = new Player("John", 100);
        playerManager.addPlayer(player);

        Player returnedPlayer = playerManager.returnPlayerByName("John");
        if (returnedPlayer != null && returnedPlayer.getName().equals("John") && returnedPlayer.getScore() == 100) {
            System.out.println("testAddPlayer PASSED");
        } else {
            System.out.println("testAddPlayer FAILED");
        }
    }

    public void testDeletePlayerByName() {
        PlayerManager playerManager = new PlayerManager();
        Player player = new Player("Jane", 200);
        playerManager.addPlayer(player);
        playerManager.deletePlayerByName("Jane");

        Player returnedPlayer = playerManager.returnPlayerByName("Jane");
        if (returnedPlayer == null) {
            System.out.println("testDeletePlayerByName PASSED");
        } else {
            System.out.println("testDeletePlayerByName FAILED");
        }
    }

    public void testReturnPlayerByName() {
        PlayerManager playerManager = new PlayerManager();
        Player player = new Player("Alex", 150);
        playerManager.addPlayer(player);

        Player returnedPlayer = playerManager.returnPlayerByName("Alex");
        if (returnedPlayer != null && returnedPlayer.getName().equals("Alex")) {
            System.out.println("testReturnPlayerByName PASSED");
        } else {
            System.out.println("testReturnPlayerByName FAILED");
        }
    }

    public void testUpdateScore() {
        PlayerManager playerManager = new PlayerManager();
        Player player = new Player("Eve", 80);
        playerManager.addPlayer(player);
        playerManager.updateScore(120, "Eve");

        Player updatedPlayer = playerManager.returnPlayerByName("Eve");
        if (updatedPlayer != null && updatedPlayer.getScore() == 120) {
            System.out.println("testUpdateScore PASSED");
        } else {
            System.out.println("testUpdateScore FAILED");
        }
    }

    public void testListBetterPlayers() {
        PlayerManager playerManager = new PlayerManager();
        playerManager.addPlayer(new Player("Tom", 90));
        playerManager.addPlayer(new Player("Jerry", 130));

        ArrayList<Player> betterPlayers = playerManager.listBetterPlayers(100);
        if (betterPlayers.size() == 1 && betterPlayers.get(0).getName().equals("Jerry")) {
            System.out.println("testListBetterPlayers PASSED");
        } else {
            System.out.println("testListBetterPlayers FAILED");
        }
    }

    public void testBestPlayer() {
        PlayerManager playerManager = new PlayerManager();
        playerManager.addPlayer(new Player("Alice", 200));
        playerManager.addPlayer(new Player("Bob", 150));

        Player bestPlayer = playerManager.bestPlayer();
        if (bestPlayer != null && bestPlayer.getName().equals("Alice")) {
            System.out.println("testBestPlayer PASSED");
        } else {
            System.out.println("testBestPlayer FAILED");
        }
    }

    public void testShowAllPlayers() {
        PlayerManager playerManager = new PlayerManager();
        playerManager.addPlayer(new Player("Lily", 50));
        playerManager.addPlayer(new Player("David", 80));

        ArrayList<Player> allPlayers = playerManager.showAllPlayers();
        if (allPlayers.size() == 2) {
            System.out.println("testShowAllPlayers PASSED");
        } else {
            System.out.println("testShowAllPlayers FAILED");
        }
    }
}
