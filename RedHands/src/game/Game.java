package game;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final List<IPlayer> players;
    
    /** 
     * ratio of each second in game to reality
     */
    private float gameSpeed;

    private final GameState state;

    public Game() {
        players = new ArrayList<>();
        state = new GameState(2);
        gameSpeed = 1f;
    }

    public void play(int playerID) {
        if (isSlapper(playerID)) {
            startSlapping(PlayerDefaultStats.armSpeed);
        } else {
            players.get(playerID).evade();
        }
    }

    /**
     * 
     * @param armSpeed the amount of time in milliseconds it takes for the hand of the slapper to reach others
     */
    private void startSlapping(int armSpeed) {
        for (IPlayer player : players) {
            if (isSlapper(player.getID())) continue;
            player.getSlapped((int)(armSpeed/gameSpeed));     
        }
    }
    
    private boolean isSlapper(int playerID) {
        return playerID == state.getSlapperID();
    }
}
