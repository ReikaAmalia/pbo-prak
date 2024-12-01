package pertemuan4.percobaan2;

public class MainPercobaan2 {
    public static void main(String[] args) {
        // Membuat objek Mobil dan mengatur merk serta biaya
        Mobil m = new Mobil();
        m.setNama("Avanza");
        m.setBiaya(350000);

        // Membuat objek Sopir dan mengatur nama serta biaya
        Sopir s = new Sopir();
        s.setNama("John Doe");
        s.setBiaya(200000);

        // Membuat objek Pelanggan dan mengatur nama, mobil, sopir, serta jumlah hari
        Pelanggan p = new Pelanggan();
        p.setNama("Jane Doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);

        // Menghitung dan menampilkan biaya total
        System.out.println("Biaya Total = " + p.hitungBiayaTotal());
        m.setMerk("Toyota");  // Set merk mobil
        System.out.println(p.getMobil().getMerk());  // Output: Toyota

    }
}