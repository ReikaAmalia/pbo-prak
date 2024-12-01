package pertemuan4.TUGAS;

public class Meja {
    private int nomor;
    private int kapasitas;

    public Meja(int nomor, int kapasitas) {
        this.nomor = nomor;
        this.kapasitas = kapasitas;
    }

    public String info() {
        return "Meja nomor: " + nomor + "\nKapasitas: " + kapasitas + " orang\n";
    }
}