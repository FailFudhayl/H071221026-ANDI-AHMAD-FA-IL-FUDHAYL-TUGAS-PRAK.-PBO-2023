public class Mahasiswa {
    // dkelarasikan atribute
    String nama;
    String nim;
    // panggil class alamat
    Alamat alamat;

    // buat method setter dan getter
    public void setNama(String namaNew) {
        nama = namaNew;
    }

    public String getNama() {
        return nama;
    }

    public void setNim(String nimNew) {
        nim = nimNew;
    }

    public String getNim() {
        return nim;
    }

    // buat methode dengan panggil kelas alamat
    Alamat geAlamat() {
        return alamat;
    }
}
