package pertemuan9.TUGASNO2;

public class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen sedang makan di kantin kampus.");
    }

    // Metode khusus Dosen: lembur
    public void lembur() {
        System.out.println("Dosen sedang lembur memeriksa tugas mahasiswa.");
    }
}
