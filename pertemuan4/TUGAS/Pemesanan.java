package pertemuan4.TUGAS;

public class Pemesanan {
    private Pelanggan pelanggan;
    private Meja meja;
    private Menu[] makanan;
    private int jumlahMakanan;

    public Pemesanan(Pelanggan pelanggan, int kapasitasMakanan) {
        this.pelanggan = pelanggan;
        this.makanan = new Menu[kapasitasMakanan];
        this.jumlahMakanan = 0;
    }

    public void setMeja(Meja meja) {
        this.meja = meja;
    }

    public void tambahMakanan(Menu menu) {
        if (jumlahMakanan < makanan.length) {
            makanan[jumlahMakanan] = menu;
            jumlahMakanan++;
        } else {
            System.out.println("Tidak bisa menambah makanan, kapasitas penuh!");
        }
    }

    public String info() {
        String info = "Informasi Pemesanan:\n";
        info += pelanggan.info();
        info += meja.info();
        info += "Daftar Makanan:\n";
        for (int i = 0; i < jumlahMakanan; i++) {
            info += makanan[i].info();
        }
        return info;
    }
}