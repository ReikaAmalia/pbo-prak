package TeoriPertemuan9;

public class SalesManager extends Manajer {
    private String departemen;

    public SalesManager(String nama, String departemen, int gaji) {
        super(nama, gaji); // Memanggil konstruktor kelas induk (Manajer)
        this.departemen = departemen;
    }

    public void cetakStatus() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Departemen: " + this.departemen);
        System.out.println("Gaji: " + this.gaji);
    }
}