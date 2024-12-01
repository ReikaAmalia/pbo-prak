package pertemuan10prak.Tugas;

public class Barrier {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void getDestroyed() {
        setStrength((int)(getStrength() * 0.64)); // Mengurangi hingga sisa 64% (sesuai output)
    }
}