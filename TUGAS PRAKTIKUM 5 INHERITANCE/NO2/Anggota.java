package NO2;

public class Anggota {
    private String posisi, nama;
    private int jumlahAnggota;

    public Anggota(String posisi, int jumlahAnggota, String nama) {
        this.posisi = posisi;
        this.jumlahAnggota = jumlahAnggota;
        this.nama = nama;
    }

    public String getPosisi() {
        return posisi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public int getJumlahAnggota() {
        return jumlahAnggota;
    }

    public void setJumlahAnggota(int jumlahAnggota) {
        this.jumlahAnggota = jumlahAnggota;
    }
}
