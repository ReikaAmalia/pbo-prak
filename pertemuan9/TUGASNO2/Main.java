package pertemuan9.TUGASNO2;

import pertemuan8.manusia;

public class Main {
    public static void main(String[] args) {
        // Dynamic method dispatch
        Manusia manusia0 = new Manusia();
        Manusia manusia1 = new Dosen();       // Referensi Manusia menunjuk ke objek Dosen
        Manusia manusia2 = new Mahasiswa();   // Referensi Manusia menunjuk ke objek Mahasiswa

        // Memanggil metode bernafas dan makan
        manusia0.bernafas();
        manusia0.makan();

        // Memanggil metode makan yang dioverride
        manusia1.makan();
        manusia2.makan();

        // Downcasting untuk memanggil metode spesifik subclass
        if (manusia1 instanceof Dosen) {
            ((Dosen) manusia1).lembur();
        }
        
        if (manusia2 instanceof Mahasiswa) {
            ((Mahasiswa) manusia2).tidur();
        }
    }
}