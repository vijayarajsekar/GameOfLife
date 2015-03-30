package hu.supercluster.gameoflife.game.cell;

public interface Cell {
    public static final int STATE_ALIVE = 1;
    public static final int STATE_DEAD = 0;

    void setState(int state);
    int getState();
    boolean isAlive();
    boolean isDead();
}
