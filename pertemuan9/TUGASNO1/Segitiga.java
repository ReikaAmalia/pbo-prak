package pertemuan9.TUGASNO1;

public class Segitiga {
    // Atribut untuk menyimpan besar sudut
    private int sudut;

    // Konstruktor
    public Segitiga(int sudut) {
        this.sudut = sudut;
    }

    // Metode pertama untuk menghitung total sudut (sisa sudut)
    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    // Metode kedua untuk menghitung total sudut (sisa sudut dari dua sudut)
    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    // Metode pertama untuk menghitung keliling segitiga dengan tiga sisi
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Metode kedua untuk menghitung panjang sisi miring segitiga siku-siku
    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
    }
}
