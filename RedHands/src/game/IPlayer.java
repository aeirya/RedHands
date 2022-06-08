package game;

public interface IPlayer {
    /** calls game */
    void play();

    void getSlapped(int delay);
    void evade();

    int getID();
}
