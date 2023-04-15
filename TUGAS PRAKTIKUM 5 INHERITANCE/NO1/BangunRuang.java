package NO1;

abstract class BangunRuang {
    abstract void hitungLuas();

    abstract void hitungVolume();
}

class Kubus extends BangunRuang {
    private Double sisi;

    public Kubus(Double sisi) {
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
        System.out.println("Luas Permukaan Kubus adalah : " + getSisi() * getSisi() * 6);
    }

    @Override
    void hitungVolume() {
        System.out.println("Volume Kubus adalah : " + getSisi() * getSisi() * getSisi());
    }
}

class Balok extends BangunRuang {
    private Double panjang, lebar, tinggi;

    public Balok(Double panjang, Double lebar, Double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
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

    public Double getTinggi() {
        return tinggi;
    }

    public void setTinggi(Double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    void hitungLuas() {
        System.out.println("Luas Permukaan Balok adalah : "
                + 2 * (getPanjang() * getLebar() + getPanjang() * getTinggi() + getLebar() * getTinggi()));
    }

    @Override
    void hitungVolume() {
        System.out.println("Volume Balok adalah : " + getPanjang() * getLebar() * getTinggi());
    }
}

class Bola extends BangunRuang {
    private Double jari2;

    public Bola(Double jari2) {
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
        System.out.println("Luas Permukaan Bola adalah : " + 4 * 3.14 * getJari2() * getJari2());
    }

    @Override
    void hitungVolume() {
        System.out.println("Volume Balok adalah : " + 4 / 3 * 3.14 * getJari2() * getJari2() * getJari2());
    }
}

class Tabung extends BangunRuang {
    private Double jari2, tinngi;

    public Tabung(Double jari2, Double tinngi) {
        this.jari2 = jari2;
        this.tinngi = tinngi;
    }

    public Double getJari2() {
        return jari2;
    }

    public void setJari2(Double jari2) {
        this.jari2 = jari2;
    }

    public Double getTinngi() {
        return tinngi;
    }

    public void setTinngi(Double tinngi) {
        this.tinngi = tinngi;
    }

    @Override
    void hitungLuas() {
        System.out.println("Luas Permukaan Tabung adalah : " + 2 * 3.14 * getJari2() * (getJari2() + getTinngi()));
    }

    @Override
    void hitungVolume() {
        System.out.println("Volume Bola adalah : " + 3.14 * getJari2() * getJari2() * getTinngi());
    }
}
