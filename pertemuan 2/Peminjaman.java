public class Peminjaman {
    public int id, harga;
    public String namaMember, namaGame;

    public void tampilDataPeminjaman() {
        System.out.println("ID          : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game   : " + namaGame);
        System.out.println("Harga       : " + harga);
    }

    public int tampilHargaBayar(int lamaSewa) {
        return harga *= lamaSewa;
    }
}

