package TeoriPertemuan9;

public class TestKepegawaian {
    public static void main(String[] args) {
        Manajer man = new Manajer("Bill Gates", 5000000);
        Supervisor spv = new Supervisor("Susanto", 10000000);
        SalesManager slman = new SalesManager("Jessica", "IT", 2000000);

        // Naikkan gaji
        man.naikkanGaji();
        spv.naikkanGaji();
        slman.naikkanGaji();

        // Cetak status 
        man.cetakStatus();
        System.out.println(); 
        
        spv.cetakStatus();
        System.out.println(); 
        
        slman.cetakStatus();
        System.out.println(); 
    }
}