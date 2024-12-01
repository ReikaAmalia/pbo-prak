package pertemuan4.TUGAS;

public class Main {
    public static void main(String[] args) {
        // Membuat pelanggan
        Pelanggan pelanggan1 = new Pelanggan("Rina", "081234567890");

        // Membuat meja
        Meja meja1 = new Meja(5, 4); // Meja nomor 5 dengan kapasitas 4 orang

        // Membuat menu makanan
        Menu menu1 = new Menu("Nasi Goreng", 25000);
        Menu menu2 = new Menu("Ayam Bakar", 30000);
        Menu menu3 = new Menu("Teh Manis", 5000);

        // Membuat pemesanan
        Pemesanan pemesanan1 = new Pemesanan(pelanggan1, 5); // Kapasitas makanan maksimal 5
        pemesanan1.setMeja(meja1);
        pemesanan1.tambahMakanan(menu1);
        pemesanan1.tambahMakanan(menu2);
        pemesanan1.tambahMakanan(menu3);

        // Menampilkan informasi pemesanan
        System.out.println(pemesanan1.info());
    }
}
