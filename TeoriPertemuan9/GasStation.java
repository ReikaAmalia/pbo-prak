package TeoriPertemuan9;

public class GasStation {
    // Metode untuk mengisi bahan bakar untuk MobilKuno
    public void isiBahanBakar(MobilKuno mobil, int uang) {
        // Menghitung jumlah liter untuk pertalite
        double liter = uang / mobil.hargaPerLiter;
        System.out.println("Mobil tua diisi pertalite sebanyak " + liter + " liter");
    }

    // Metode untuk mengisi bahan bakar untuk MobilMewah
    public void isiBahanBakar(MobilMewah mobil, int uang) {
        // Menghitung jumlah liter untuk pertamax
        double liter = uang / mobil.hargaPerLiter;
        System.out.println("Mobil mewah diisi pertamax sebanyak " + liter + " liter");
    }
}