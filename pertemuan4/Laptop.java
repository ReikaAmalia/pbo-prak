package pertemuan4;

public class Laptop {
    private String merk;
    private Processor proc;

    public Laptop() {
        this.merk = "Unknown";
        this.proc = new Processor();
    }

    public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }

    public void info() {
        System.out.println("Merk Laptop = " + this.merk);
        proc.info();
    }

}
