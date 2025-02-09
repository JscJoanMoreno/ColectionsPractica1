package FootballTeam;

public class TestFootbalTeamManager {
    public static void main(String[] args) {
        FootballTeamManager manager = new FootballTeamManager();

        manager.addPlayer(10, new Player("Messi", 36, "Forward"));
        manager.addPlayer(7, new Player("Ronaldo", 39, "Forward"));
        manager.addPlayer(1, new Player("Neuer", 38, "Goalkeeper"));
        manager.addPlayer(5, new Player("Piqué", 37, "Defender"));

        System.out.println("\nPlayer with number 10:");
        System.out.println(manager.findPlayerByNumber(10));

        System.out.println("\nPlayer named 'Ronaldo':");
        System.out.println(manager.findPlayerByName("Ronaldo"));

        System.out.println("\nPlayers sorted by number:");
        manager.listPlayersByNumber();

        System.out.println("\nPlayers sorted by age:");
        manager.listPlayersByAge();

        System.out.println("\nPlayers in position 'Forward':");
        manager.listPlayersByPosition("Forward");
    }
}

