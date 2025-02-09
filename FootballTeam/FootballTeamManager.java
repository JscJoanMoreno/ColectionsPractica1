package FootballTeam;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FootballTeamManager {
    private HashMap<Integer, Player> team = new HashMap<>();

    // a) Add player
    public void addPlayer(int number, Player player) {
        if (!team.containsKey(number)) {
            team.put(number, player);
            System.out.println("Player added successfully.");
        } else {
            System.out.println("Error: Number already assigned.");
        }
    }

    // b) Find player by number
    public Player findPlayerByNumber(int number) {
        return team.getOrDefault(number, null);
    }

    // c) Find player by name
    public Player findPlayerByName(String name) {
        for (Player player : team.values()) {
            if (player.getName().equalsIgnoreCase(name)) {
                return player;
            }
        }
        return null;
    }

    // d) List players sorted by number
    public void listPlayersByNumber() {
        team.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println("Number: " + entry.getKey() + " - " + entry.getValue()));
    }

    // e) List players sorted by age
    public void listPlayersByAge() {
        team.values().stream()
                .sorted(Comparator.comparingInt(Player::getAge))
                .forEach(System.out::println);
    }

    // f) List players by position
    public void listPlayersByPosition(String position) {
        team.values().stream()
                .filter(player -> player.getPosition().equalsIgnoreCase(position))
                .forEach(System.out::println);
    }
}