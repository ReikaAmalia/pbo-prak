package pertemuan3.KoperasiSimpanPinjam;

import java.util.Scanner;

public class TestKoperasi {
    
    private static double angsuranTambah;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nomor KTP: ");
        String nomorKTP = scanner.nextLine();

        System.out.println("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.println("Masukkan limit pinjaman: ");
        double limitPinjaman = scanner.nextDouble();

        Anggota anggota = new Anggota(nomorKTP, nama, limitPinjaman);

        System.out.println("\nnNama Anggota: " + anggota.getNama());
        System.out.println("Limit Pinjaman: " + (int)anggota.getLimitPinjaman());

        System.out.println("\nMasukkan jumlah uang yang ingin dipinjam: ");
        double jumlahPinjam = scanner.nextDouble();
        System.out.println("\nMeminjam uang " + (int)jumlahPinjam + "...");
        anggota.pinjam(jumlahPinjam);
        System.out.println("Jumlah Pinjaman saat ini: " + (int)anggota.getJumlahPinjaman());

        System.out.println("\nMasukkan jumlah uang yang ingin dipinjam lagi: ");
        jumlahPinjam = scanner.nextDouble();
        System.out.println("\nMeminjam uang " + (int)jumlahPinjam + "...");
        anggota.pinjam(jumlahPinjam);
        System.out.println("Jumlah pinjaman saat ini: " + (int)anggota.getJumlahPinjaman());

        System.out.println("\nMasukkan jumlah angsuran: ");
        double jumlahAngsur = scanner.nextDouble();
        System.out.println("\nMembayar angsuran " + (int)jumlahAngsur + "...");
        anggota.angsur(jumlahAngsur);
        System.out.println("Jumlah pinjaman saat ini: " + (int)anggota.getJumlahPinjaman());

        System.out.println("\nMasukkan jumlah angsuran lagi: ");
        jumlahAngsur = scanner.nextDouble();
        System.out.println("\nMembayar angsuran " + (int)jumlahAngsur + "...");
        anggota.angsur(jumlahAngsur);
        System.out.println("Jumlah pinjaman saat ini: " + (int)anggota.getJumlahPinjaman());
       
        scanner.close();
    }
}