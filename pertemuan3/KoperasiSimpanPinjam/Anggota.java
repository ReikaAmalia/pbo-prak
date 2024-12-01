package pertemuan3.KoperasiSimpanPinjam;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private double limitPeminjaman;
    private double jumlahPinjaman;

    Anggota(String nomorKTP, String nama, double limitPeminjaman){
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0;
    }

    public void pinjam(double nominal) {
        if (this.jumlahPinjaman + nominal > this.limitPeminjaman) {
            System.out.println("Maaf jumlah pinjaman melebihi limit.");
        } else {
            this.jumlahPinjaman += nominal;
        }
    }

    public void angsur(double nominal) {
        if (nominal > this.jumlahPinjaman) {
            System.out.println("Maaf, angsuran melebihi jumlah pinjaman.");
        } else {
            if (nominal == (0.1 * jumlahPinjaman)) {
                this.jumlahPinjaman -= nominal;
            } else {
                System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
            }
        }
    }

    public String getNama() {
        return nama;
    }

    public double getLimitPinjaman(){
        return limitPeminjaman;
    }

    // getter untuk jumlah pinjaman
    public double getJumlahPinjaman(){
        return jumlahPinjaman;
    }
}

