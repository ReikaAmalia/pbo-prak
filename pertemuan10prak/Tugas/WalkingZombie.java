package pertemuan10prak.Tugas;

public class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        if (getLevel() == 1) {
            setHealth((int)(getHealth() * 1.2));
        } else if (getLevel() == 2) {
            setHealth((int)(getHealth() * 1.3));
        } else {
            setHealth((int)(getHealth() * 1.4));
        }
    }

    @Override
    public void getDestroyed() {
        setHealth((int)(getHealth() * 0.42)); // Mengurangi hingga sisa 42% (sesuai output)
    }
}