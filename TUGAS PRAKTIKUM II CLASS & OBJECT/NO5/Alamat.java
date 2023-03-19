public class Alamat {
    // buat atribut
    String jalan;
    String kota;

    // buat methode setter dan getter
    public void setAlamat(String road, String city) {
        jalan = road;
        kota = city;
    }

    public String getAlamatLengkap() {
        return "Jalan " + jalan + ", Kota " + kota;
    }
}
