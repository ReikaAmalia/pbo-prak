package pertemuan4;

public class Processor {
    private String merk;
    private double cache;

    public Processor() {
        this.merk = "Unknown";
        this.cache = 0.0;
    }

    public Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return this.merk;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public double getCache() {
        return this.cache;
    }

    public void info()  {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }

}
