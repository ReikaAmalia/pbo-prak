package TeoriPertemuan9;

public class Manajer {
    protected String nama;
    protected int gaji;

    public Manajer(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public void naikkanGaji() {
        this.gaji += 1000000; // Tambahkan gaji sebesar 1 juta
    }

    public void cetakStatus() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Gaji: " + this.gaji);
    }
}