public class MainLingkaran {
    public static void main(String[] args) {
        Lingkaran lkr = new Lingkaran();
        lkr.phi = 3.14;
        lkr.r = 10;
        System.out.println("Luas : " + lkr.hitungLuas());
        System.out.println("Keliling : " + lkr.hitungKeliling());
    }
}
