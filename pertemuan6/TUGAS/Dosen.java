package pertemuan6.TUGAS;

public class Dosen extends Pegawai {
    private int jumlahSKS;
    private static final int TARIF_SKS = 150000;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    public int getGaji() {
        return jumlahSKS * TARIF_SKS;
    }
}