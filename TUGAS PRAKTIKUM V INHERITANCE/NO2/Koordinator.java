package NO2;

public class Koordinator extends Anggota {
    private String bidang;

    public Koordinator(String posisi, int jumlahAnggota, String bidang, String nama) {
        super(posisi, jumlahAnggota, nama);
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public void departeman() {
        System.out
                .println("Nama saya adalah " + super.getNama() + ", saya merupakan koordinator bidang " + getBidang());
    }
}

class Staff extends Koordinator {
    String jobDesk;

    public Staff(String posisi, int jumlahAnggota, String bidang, String nama, String jobDesk) {
        super(posisi, jumlahAnggota, bidang, nama);
        this.jobDesk = jobDesk;
    }

    public String getJobDesk() {
        return jobDesk;
    }

    public void setJobDesk(String jobDesk) {
        this.jobDesk = jobDesk;
    }

    public void pekerjaan() {
        System.out.println("Nama saya adalah " + super.getNama() + ", saya adalah staff di Departemen "
                + super.getBidang() + " dan Pekerjaan saya adalah " + getJobDesk());
    }
}
