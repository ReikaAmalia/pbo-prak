package pertemuan9.TUGASNO2;

class Mahasiswa extends Manusia {
    // Override metode makan untuk Mahasiswa
    @Override
    public void makan() {
        System.out.println("Mahasiswa sedang makan di warung.");
    }

    // Metode khusus Mahasiswa: tidur
    public void tidur() {
        System.out.println("Mahasiswa sedang tidur setelah belajar.");
    }
}