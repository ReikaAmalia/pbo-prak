package UTS;

public class Pengguna {
    private String idPengguna;
    private String nama;
    private String email;

    public Pengguna(String idPengguna, String nama, String email) {
        this.idPengguna = idPengguna;
        this.nama = nama;
        this.email = email;
    }

    public String getIdPengguna() {
        return idPengguna;
    }

    public void setIdPengguna(String idPengguna) {
        this.idPengguna = idPengguna;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void tampilkanInfoPengguna() {
        System.out.println("ID Pengguna: " + idPengguna);
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
    }
}