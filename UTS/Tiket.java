package UTS;

public class Tiket {
    private String idTiket;
    private String acara;
    private double harga;

    public Tiket(String idTiket, String acara, double harga) {
        this.idTiket = idTiket;
        this.acara = acara;
        this.harga = harga;
    }

    public String getIdTiket() {
        return idTiket;
    }

    public void setIdTiket(String idTiket) {
        this.idTiket = idTiket;
    }

    public String getAcara() {
        return acara;
    }

    public void setAcara(String acara) {
        this.acara = acara;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void tampilkanInfoTiket() {
        System.out.println("ID Tiket: " + idTiket);
        System.out.println("Acara: " + acara);
        System.out.println("Harga: Rp " + harga);
    }
}