package pertemuan3;

public class EncapDemo {
    private String name;
    private int age;

    public String getNama(){
        return name;
    }

    public void setNama(String newName) {
        this.name = newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        if (newAge > 30 || newAge <= 18) {
            System.out.println("Tidak dapat memasukkan umur, maksimal 30 minimal 18");
            age = 0;
        } else {
            age = newAge;
        }
    }
}
