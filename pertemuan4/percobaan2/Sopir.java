package pertemuan4.percobaan2;

public class Sopir {
    // Atribut dengan akses private
    private String nama;
    private int biaya;

    // Constructor default
    public Sopir() {
        this.nama = "";
        this.biaya = 0;
    }

    // Setter untuk atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk atribut nama
    public String getNama() {
        return this.nama;
    }

    // Setter untuk atribut biaya
    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    // Getter untuk atribut biaya
    public int getBiaya() {
        return this.biaya;
    }

    // Method untuk menghitung biaya sopir berdasarkan jumlah hari
    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }
}
