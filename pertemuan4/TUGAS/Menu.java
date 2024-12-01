package pertemuan4.TUGAS;

public class Menu {
    private String nama;
    private double harga;

    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String info() {
        return "Menu: " + nama + "\nHarga: Rp " + harga + "\n";
    }
}