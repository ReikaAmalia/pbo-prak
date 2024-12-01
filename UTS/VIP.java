package UTS;

public class VIP extends Pengguna {
    private String tingkatVIP;

    public VIP(String idPengguna, String nama, String email, String tingkatVIP) {
        super(idPengguna, nama, email);
        this.tingkatVIP = tingkatVIP;
    }

    public String getTingkatVIP() {
        return tingkatVIP;
    }

    public void setTingkatVIP(String tingkatVIP) {
        this.tingkatVIP = tingkatVIP;
    }

    public void tampilkanInfoPengguna() {
        super.tampilkanInfoPengguna();
        System.out.println("Tingkat VIP: " + tingkatVIP);
    }
}