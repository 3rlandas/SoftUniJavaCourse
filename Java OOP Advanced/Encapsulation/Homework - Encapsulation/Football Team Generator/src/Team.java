import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    public String name;
    private List<Player> players;

    public Team(String name) {
        setName(name);
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().isEmpty()){
            throw new IllegalArgumentException("Names cannot be blank.");
        }
            this.name = name;
    }

    public void addPlayer(Player player) {

        players.add(player);
    }

    public List<Player> getPlayers() {
        return Collections.unmodifiableList(players);
    }


    public void removePlayer(String player) {

        boolean isRemove = players.removeIf(p -> p.getName().equals(player));

        if (!isRemove) {
            throw new IllegalArgumentException(String.format(
                    "Player %s is not in %s.", player, this.name));
        }

        /*if(!players.contains(player)){
            String message = String.format("Player %s is not in %s", player, this.name);
            throw new IllegalArgumentException(message);
        }

        players.remove(player);*/

    }

    public double getRating() {

        return players.stream().mapToDouble(Player::overallSkillLevel).average().orElse(0.0);
    }
}
