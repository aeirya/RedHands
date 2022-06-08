package game;

public class Player {
    private Thread slapThread;

    public void getSlapped(int delay) {
        slapThread = new Thread(
            () -> {
                try {
                    Thread.sleep(delay);

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        );
    }

    public void evade() {
        slapThread.interrupt();
    }
}
