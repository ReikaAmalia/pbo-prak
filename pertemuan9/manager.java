package pertemuan9;

public class manager extends karyawan {
    private double tunjangan;
    private String bagian;
    private staff st[];

    // Setter untuk tunjangan
    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    // Getter untuk tunjangan
    public double getTunjangan() {
        return tunjangan;
    }

    // Setter untuk bagian
    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    // Getter untuk bagian
    public String getBagian() {
        return bagian;
    }

    // Setter untuk staff
    public void setStaff(staff st[]) {
        this.st = st;
    }

    // Method untuk melihat info staff
    public void viewStaff() {
        int i;
        System.out.println("-----------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfo();
        }
        System.out.println("-----------------");
    }

    // Method untuk melihat info manager
    public void lihatInfo() {
        System.out.println("Manager  :" + this.getBagian());
        System.out.println("NIP  :" + this.getNip());
        System.out.println("Nama  :" + this.getNama());
        System.out.println("Golongan  :" + this.getGolongan());
        // Mencetak tunjangan dengan format %.0f untuk tipe double
        System.out.printf("Tunjangan  :%.0f\n", this.getTunjangan());
        // Mencetak gaji dengan format %.0f untuk tipe double
        System.out.printf("Gaji  :%.0f\n", this.getGaji());
        // Mencetak bagian dengan format %s untuk tipe String
        System.out.printf("Bagian  :%s\n", this.getBagian());
        this.viewStaff();
    }

    // Method untuk menghitung gaji total
    public double getGaji() {
        return super.getGaji() + tunjangan;
    }
}
