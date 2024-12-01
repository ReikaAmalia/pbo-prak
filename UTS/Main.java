package UTS;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Pengguna
        Pengguna pengguna1 = new Pengguna("U001", "Reika", "Reika@reika.com");

        // Membuat objek PenggunaVIP
        VIP penggunaVIP1 = new VIP("U002", "leonhart", "leonhart@rere.com", "Gold");

        // Membuat objek Tiket
        Tiket tiket1 = new Tiket("T001", "Konser Musik", 500000);

        // Membuat objek Pemesanan untuk pengguna biasa
        Pemesanan pemesanan1 = new Pemesanan("P001", pengguna1, tiket1, 2);
        
        // Membuat objek Pemesanan untuk pengguna VIP
        Pemesanan pemesananVIP = new Pemesanan("P002", penggunaVIP1, tiket1, 3);

        // Menampilkan informasi pemesanan untuk pengguna biasa
        System.out.println("=== Pemesanan untuk Pengguna Biasa ===");
        pemesanan1.tampilkanInfoPemesanan();

        // Menampilkan informasi pemesanan untuk pengguna VIP
        System.out.println("\n=== Pemesanan untuk Pengguna VIP ===");
        pemesananVIP.tampilkanInfoPemesanan();//
    }
}