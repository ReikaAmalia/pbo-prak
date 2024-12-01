package pertemuan10prak.Tugas;

public class Plant {
    public void doDestroy(Zombie zombie) {
        zombie.getDestroyed();
    }

    public void doDestroy(Barrier barrier) {
        barrier.getDestroyed();
    }
}