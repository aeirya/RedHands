package game;

import java.util.ArrayList;
import java.util.List;

public class GameState {
    private int slapeprID;
    private final List<Integer> scores;

    public GameState(int players) {
        scores = new ArrayList<>(players);
        for (int i=0; i<players; ++i) {
            scores.add(0);
        }
        
        slapeprID = 0;
    }

    public void setSlapperID(int id) {
        this.slapeprID = id;
    }

    public int getSlapperID() {
        return slapeprID;
    }

    public void increaseScore(int id) {
        scores.set(id, scores.get(id) + 1);
    }

    public void decreaseScore(int id) {
        scores.set(id, scores.get(id) - 1);
    }
}
