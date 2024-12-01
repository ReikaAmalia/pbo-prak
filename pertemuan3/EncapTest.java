package pertemuan3;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setNama("James");
        encap.setAge(35);

        System.out.println("Name : " + encap.getNama());
        System.out.println("Age : " + encap.getAge());

        encap.setAge(13);
        System.out.println("Age : " + encap.getAge());
        encap.setAge(20);
        System.out.println("Age : " + encap.getAge());
    }
}
