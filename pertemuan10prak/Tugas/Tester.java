package pertemuan10prak.Tugas;

public class Tester {
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier b = new Barrier(100);
        Plant p = new Plant();

        // Cetak data awal
        System.out.println("Walking Zombie Data = ");
        System.out.println("Health: " + wz.getHealth());
        System.out.println("Level: " + wz.getLevel());
        System.out.println();

        System.out.println("Jumping Zombie Data = ");
        System.out.println("Health: " + jz.getHealth());
        System.out.println("Level: " + jz.getLevel());
        System.out.println();

        System.out.println("Barrier Strength = " + b.getStrength());
        System.out.println("\n----------------------");

        // Menghancurkan objek
        p.doDestroy(wz);
        p.doDestroy(jz);
        p.doDestroy(b);

        // Cetak data setelah perubahan
        System.out.println("Walking Zombie Data = ");
        System.out.println("Health: " + wz.getHealth());
        System.out.println("Level: " + wz.getLevel());
        System.out.println();

        System.out.println("Jumping Zombie Data = ");
        System.out.println("Health: " + jz.getHealth());
        System.out.println("Level: " + jz.getLevel());
        System.out.println();

        System.out.println("Barrier Strength = " + b.getStrength());
    }
}