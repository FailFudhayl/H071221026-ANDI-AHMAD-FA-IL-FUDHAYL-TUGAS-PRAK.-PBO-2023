package NO2;

public class PengurusInti extends Anggota {
    private String jabatan;

    public PengurusInti(String posisi, int jumlahAnggota, String jabatan, String nama) {
        super(posisi, jumlahAnggota, nama);
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}

class Ketua extends PengurusInti {
    public Ketua(String posisi, int jumlahAnggota, String jabatan, String nama) {
        super(posisi, jumlahAnggota, jabatan, nama);
    }

    int pecatAnggota() {
        return super.getJumlahAnggota() - 1;
    }
}

class Bendahara extends PengurusInti {
    private int dana;

    public Bendahara(String posisi, int jumlahAnggota, String jabatan, int dana, String nama) {
        super(posisi, jumlahAnggota, jabatan, nama);
        this.dana = dana;
    }

    public int getDana() {
        return dana;
    }

    public void setDana(int dana) {
        this.dana = dana;
    }

    int tambahUang(int uangMasuk) {
        return getDana() + uangMasuk;
    }

    int kurangUang(int uangKeluar) {
        return getDana() + uangKeluar;
    }
}

class Sekretaris extends PengurusInti {
    int surat;

    public Sekretaris(String posisi, int jumlahAnggota, String jabatan, int surat, String nama) {
        super(posisi, jumlahAnggota, jabatan, nama);
        this.surat = surat;
    }

    public int getSurat() {
        return surat;
    }

    public void setSurat(int surat) {
        this.surat = surat;
    }

    int suratMasuk(int suratmasuk) {
        return getSurat() + suratmasuk;
    }

    int suratkeluar(int suratkeluar) {
        return getSurat() - suratkeluar;
    }
}