package pertemuan10prak.Tugas;

public abstract class Zombie {
    private int health;
    private int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public abstract void heal();
    public abstract void getDestroyed();
}
