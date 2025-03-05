
import java.util.ArrayList;
import java.util.List;

public class PlayerManager {
    private List<Player> players;

    public PlayerManager() {
        players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void payAccount(Player player, double amount) {
        // Logic to pay player's account
        System.out.println("Paid " + amount + " to " + player.getName());
    }

    public List<Player> getPlayers() {
        return players;
    }
}
