package pertemuan6.percobaan2;

public class ClassA {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void getNilaiX() {
        System.out.println("Nilai X: " + x);
    }

    public void getNilaiY() {
        System.out.println("Nilai Y: " + y);
    }
}