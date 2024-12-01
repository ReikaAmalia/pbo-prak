public class TestMahasiswa {
    public static void main(String[] args) {
        System.out.println("--------------------");
        Mahasiswa mhs1=new Mahasiswa();
        mhs1.nim=101;
        mhs1.nama="Lestari";
        mhs1.alamat="Jl. Vinolia No 1A";
        mhs1.kelas="1A";
        mhs1.tampilBiodata();
        System.out.println("--------------------");
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim=102;
        mhs2.nama="Rani";
        mhs2.alamat="Jl. Haryono No 30";
        mhs2.kelas="2B";
        mhs2.tampilBiodata();
        System.out.println("--------------------");
        mhs1.nim=103;
        mhs1.nama="Yeager";
        mhs1.alamat="Jl. Ravlesia No 9";
        mhs1.kelas="1B";
        mhs1.tampilBiodata();
    }
}
