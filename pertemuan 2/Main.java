public class Main {
    public static void main(String[] args) {
        Peminjaman pmj1 = new Peminjaman();
        pmj1.id = 1;
        pmj1.namaMember = "Reika";
        pmj1.namaGame = "Mobile Legend";
        pmj1.harga = 10000;
        pmj1.tampilDataPeminjaman();
        System.out.println("Total pembayaran : " + pmj1.tampilHargaBayar(4));
    }
}
