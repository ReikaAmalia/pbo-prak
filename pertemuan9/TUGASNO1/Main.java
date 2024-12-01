package pertemuan9.TUGASNO1;

public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan class Segitiga
        Segitiga segitiga = new Segitiga(90);

        // Menghitung total sudut dengan satu sudut diketahui
        System.out.println("Total Sudut (satu sudut): " + segitiga.totalSudut(60));

        // Menghitung total sudut dengan dua sudut diketahui
        System.out.println("Total Sudut (dua sudut): " + segitiga.totalSudut(60, 40));

        // Menghitung keliling dengan tiga sisi diketahui
        System.out.println("Keliling (tiga sisi): " + segitiga.keliling(3, 6, 9));

        // Menghitung panjang sisi miring segitiga siku-siku
        System.out.println("Sisi miring: " + segitiga.keliling(3, 6));
    }
}
