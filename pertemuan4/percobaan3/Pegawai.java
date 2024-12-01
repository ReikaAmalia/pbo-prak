package pertemuan4.percobaan3;

public class Pegawai {
    private String nip;
    private String nama;

    // Constructor dengan parameter nip dan nama
    public Pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    // Setter dan Getter untuk atribut nip
    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNip() {
        return this.nip;
    }

    // Setter dan Getter untuk atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    // Method info() untuk menampilkan informasi pegawai
    public String info() {
        String info = "";
        info += "NIP: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}