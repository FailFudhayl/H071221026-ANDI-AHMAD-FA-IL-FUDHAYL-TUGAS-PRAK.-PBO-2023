
public class Main {
    public static void main(String[] args) {
        // buat objek dan beri nilai atributenya
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";

        // buat objek lalu beri nilai atributenya
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Ikhsan";
        mahasiswa.nim = "H071191049";

        // cetak detail mahasiswa dengan panggil methode getternya
        System.out.println("Nama : " + mahasiswa.getNama());
        System.out.println("NIM : " + mahasiswa.getNim());
        // panggil terlebih dahulu getAlaamt lalu getAlamatLengkap karena method alaamt
        // lengkap ada dalama kelas alamat
        System.out.println("Alamat : " + mahasiswa.geAlamat().getAlamatLengkap());
    }
}
