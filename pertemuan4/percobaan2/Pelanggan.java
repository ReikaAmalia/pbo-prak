package pertemuan4.percobaan2;

public class Pelanggan {
    // Attributes with private access (-)
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    // Default constructor
    public Pelanggan() {
        this.nama = "";
        this.mobil = new Mobil();  // Create a new Mobil object
        this.sopir = new Sopir();  // Create a new Sopir object
        this.hari = 0;
    }

    // Setter and Getter for nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    // Setter and Getter for mobil
    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public Mobil getMobil() {
        return this.mobil;
    }

    // Setter and Getter for sopir
    public void setSopir(Sopir sopir) {
        this.sopir = sopir;
    }

    public Sopir getSopir() {
        return this.sopir;
    }

    // Setter and Getter for hari
    public void setHari(int hari) {
        this.hari = hari;
    }

    public int getHari() {
        return this.hari;
    }

    // Method to calculate total cost (mobil + sopir)
    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
}
