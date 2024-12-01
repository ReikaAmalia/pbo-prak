package pertemuan6.TUGAS;

public class Main {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("123", "Dr. Budi", "Jakarta");
        dosen1.setSKS(12);

        Dosen dosen2 = new Dosen("124", "Prof. Ani", "Bandung");
        dosen2.setSKS(10);

        DaftarGaji daftarGaji = new DaftarGaji(2);
        daftarGaji.addPegawai(dosen1);
        daftarGaji.addPegawai(dosen2);

        daftarGaji.printSemuaGaji();
    }
}