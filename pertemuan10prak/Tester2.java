package pertemuan10prak;

public class Tester2 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500); // Membuat objek PermanentEmployee
        Employee e;

        e = pEmp; // Referensi e bertipe Employee menunjuk ke objek PermanentEmployee
        System.out.print(e.getEmployeeInfo()); // Memanggil getEmployeeInfo() melalui referensi e
        System.out.println("--------------------"); // Menambahkan garis pemisah sesuai dengan output
        System.out.print(pEmp.getEmployeeInfo()); // Memanggil getEmployeeInfo() langsung dari objek pEmp
    }
}
