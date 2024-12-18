package pertemuan4.percobaan3;

public class KeretaApi {
    // Atribut private sesuai dengan diagram
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    // Constructor 3 parameter (tanpa asisten)
    public KeretaApi(String nama, String kelas, Pegawai masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = null; // Asisten belum ditentukan
    }

    // Constructor 4 parameter (dengan asisten)
    public KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    // Setter dan Getter untuk atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    // Setter dan Getter untuk atribut kelas
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getKelas() {
        return this.kelas;
    }

    // Setter dan Getter untuk masinis
    public void setMasinis(Pegawai masinis) {
        this.masinis = masinis;
    }

    public Pegawai getMasinis() {
        return this.masinis;
    }

    // Setter dan Getter untuk asisten
    public void setAsisten(Pegawai asisten) {
        this.asisten = asisten;
    }

    public Pegawai getAsisten() {
        return this.asisten;
    }

    // Method info() untuk menampilkan informasi kereta api, masinis, dan asisten
    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        // Mengecek apakah asisten tersedia atau tidak
        if (this.asisten != null) {
            info += "Asisten: " + this.asisten.info() + "\n";
        } else {
            info += "Asisten: Tidak ada\n";
        }
        return info;
    }
}