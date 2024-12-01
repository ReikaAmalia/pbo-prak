package pertemuan4.TUGAS;

public class Pelanggan {
    private String nama;
    private String kontak;

    public Pelanggan(String nama, String kontak) {
        this.nama = nama;
        this.kontak = kontak;
    }

    public String info() {
        return "Nama: " + nama + "\nKontak: " + kontak + "\n";
    }
}
