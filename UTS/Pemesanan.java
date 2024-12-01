package UTS;

public class Pemesanan {
    private String idPemesanan;
    private Pengguna pengguna;
    private Tiket tiket;
    private int jumlah;

    public Pemesanan(String idPemesanan, Pengguna pengguna, Tiket tiket, int jumlah) {
        this.idPemesanan = idPemesanan;
        this.pengguna = pengguna;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }

    public String getIdPemesanan() {
        return idPemesanan;
    }

    public void setIdPemesanan(String idPemesanan) {
        this.idPemesanan = idPemesanan;
    }

    public Pengguna getPengguna() {
        return pengguna;
    }

    public void setPengguna(Pengguna pengguna) {
        this.pengguna = pengguna;
    }

    public Tiket getTiket() {
        return tiket;
    }

    public void setTiket(Tiket tiket) {
        this.tiket = tiket;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    // Metode untuk menghitung total harga, dengan diskon untuk pengguna VIP
    public double hitungTotalHarga() {
        double total = tiket.getHarga() * jumlah;

        // untuk cek apakah pengguna adalah VIP
        if (pengguna instanceof VIP) {
            //  Diskon 10% untuk pengguna VIP
            total *= 0.9;
            System.out.println("Diskon 10% untuk pengguna VIP diterapkan.");
        }

        return total;
    }

    public void tampilkanInfoPemesanan() {
        System.out.println("ID Pemesanan: " + idPemesanan);
        pengguna.tampilkanInfoPengguna();
        tiket.tampilkanInfoTiket();
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total Harga: Rp " + hitungTotalHarga());
    }
}