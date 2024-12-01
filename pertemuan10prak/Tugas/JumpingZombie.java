package pertemuan10prak.Tugas;

public class JumpingZombie extends Zombie {
    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        if (getLevel() == 1) {
            setHealth((int)(getHealth() * 1.3));
        } else if (getLevel() == 2) {
            setHealth((int)(getHealth() * 1.4));
        } else {
            setHealth((int)(getHealth() * 1.5));
        }
    }

    @Override
    public void getDestroyed() {
        setHealth((int)(getHealth() * 0.66)); // Mengurangi hingga sisa 66% (sesuai output)
    }
}