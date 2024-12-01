package pertemuan4.percobaan3;

public class MainPertanyaan {
    public static void main(String[] args) {
        // Membuat objek Pegawai untuk masinis
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        
        // Membuat objek KeretaApi dengan masinis yang telah dibuat
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis);
        
        // Mencetak informasi tentang kereta api
        System.out.println(keretaApi.info());
    }
}