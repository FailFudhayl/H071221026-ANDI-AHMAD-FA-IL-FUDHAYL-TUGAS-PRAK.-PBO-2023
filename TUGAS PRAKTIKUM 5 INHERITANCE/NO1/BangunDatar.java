package NO1;

abstract class BangunDatar {
    abstract void hitungLuas();

    abstract void hitungKeliling();
}

class Persegi extends BangunDatar {
    private Double sisi;

    public Persegi(Double sisi) {
        this.sisi = sisi;
    }

    public Double getSisi() {
        return sisi;
    }

    public void setSisi(Double sisi) {
        this.sisi = sisi;
    }

    @Override
    void hitungLuas() {
        System.out.println("Luas Persegi adalah : " + getSisi() * getSisi());
    }

    @Override
    void hitungKeliling() {
        System.out.println("Keliling Persegi adalah : " + 4 * getSisi());
    }

}

class PersegiPanjang extends BangunDatar {
    private Double panjang, lebar;

    public PersegiPanjang(Double panjang, Double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public Double getPanjang() {
        return panjang;
    }

    public void setPanjang(Double panjang) {
        this.panjang = panjang;
    }

    public Double getLebar() {
        return lebar;
    }

    public void setLebar(Double lebar) {
        this.lebar = lebar;
    }

    @Override
    void hitungLuas() {
        System.out.println("Luas Persegi Panjang adalah : " + getPanjang() * getLebar());
    }

    @Override
    void hitungKeliling() {
        System.out.println("Keliling Persegi Panjang adalah : " + 2 * (getPanjang() + getLebar()));
    }
}

class Lingkaran extends BangunDatar {
    private Double jari2;

    public Lingkaran(Double jari2) {
        this.jari2 = jari2;
    }

    public Double getJari2() {
        return jari2;
    }

    public void setJari2(Double jari2) {
        this.jari2 = jari2;
    }

    @Override
    void hitungLuas() {
        System.out.println("Luas Lingkaran adalah : " + 3.14 * getJari2() * getJari2());
    }

    @Override
    void hitungKeliling() {
        System.out.println("Luas Persegi Panjang adalah : " + 3.14 * (getJari2() + getJari2()));
    }
}

class Segitiga extends BangunDatar {
    private Double sisi, tinggi;

    public Segitiga(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    void hitungLuas() {
        System.out.println("Luas Segitiga adalah : " + 0.5 * getSisi() * getTinggi());
    }

    @Override
    void hitungKeliling() {
        System.out.println("Keliling Segitiga adalah : " + 3 * getSisi());
    }
}

class Trapesium extends BangunDatar {
    private Double sisMiring1, sisiMiring2, sisiSejajar1, sisiSejajar2, tinggi;

    public Trapesium(Double sisMiring1, Double sisiMiring2, Double sisiSejajar1, Double sisiSejajar2, Double tinggi) {
        this.sisMiring1 = sisMiring1;
        this.sisiMiring2 = sisiMiring2;
        this.sisiSejajar1 = sisiSejajar1;
        this.sisiSejajar2 = sisiSejajar2;
        this.tinggi = tinggi;
    }

    public Double getSisMiring1() {
        return sisMiring1;
    }

    public void setSisMiring1(Double sisMiring1) {
        this.sisMiring1 = sisMiring1;
    }

    public Double getSisiMiring2() {
        return sisiMiring2;
    }

    public void setSisiMiring2(Double sisiMiring2) {
        this.sisiMiring2 = sisiMiring2;
    }

    public Double getSisiSejajar1() {
        return sisiSejajar1;
    }

    public void setSisiSejajar1(Double sisiSejajar1) {
        this.sisiSejajar1 = sisiSejajar1;
    }

    public Double getSisiSejajar2() {
        return sisiSejajar2;
    }

    public void setSisiSejajar2(Double sisiSejajar2) {
        this.sisiSejajar2 = sisiSejajar2;
    }

    public Double getTinggi() {
        return tinggi;
    }

    public void setTinggi(Double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    void hitungLuas() {
        System.out.println("Luas Trapesium adalah : " + 0.5 * (getSisiSejajar1() + getSisiSejajar2()) * getTinggi());
    }

    @Override
    void hitungKeliling() {
        System.out.println("Keliling Trapesium adalah : " + getSisMiring1() + getSisiSejajar1() + getSisiMiring2()
                + getSisiSejajar2());
    }
}
