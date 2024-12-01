package pertemuan4.percobaan2;

public class Mobil {
    // Atribut dengan akses private
    private String nama;
    private int biaya;
    private String merk;

    // Setter dan Getter untuk 'merk'
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return this.merk;
    }
    
    // Constructor default
    public Mobil() {
        this.nama = "";
        this.biaya = 0;
        this.merk = "";
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

    // Method untuk menghitung biaya sewa mobil berdasarkan jumlah hari
    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}
