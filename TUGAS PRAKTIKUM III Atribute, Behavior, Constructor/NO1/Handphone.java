package NO1;

public class Handphone {
    String merek;
    // Double penyimpanan;
    int harga, baterai, penyimpanan;

    public Handphone(String merek, int harga, int penyimpanan) {
        this.merek = merek;
        this.harga = harga;
        this.penyimpanan = penyimpanan;
        this.baterai = 100;
    }

    public Handphone() {
        this.merek = "Nokia";
        this.harga = 1000000;
        this.penyimpanan = 1;
        this.baterai = 100;
    }

    public void upgradeMemori(int tambahMemori, int biaya) {
        this.setPenyimpanan(this.getPenyimpanan() + tambahMemori);
        this.setHarga(this.getHarga() + biaya);
        System.out.printf("\nUpgrade memori handphone %s sebanyak %dGB menambah harga menjadi %d\n", this.getName(),
                this.getPenyimpanan(), this.getHarga());
    }

    public void transferData(Handphone hpLain, int pindahMemori) {
        hpLain.setPenyimpanan(hpLain.getPenyimpanan() + pindahMemori);
        this.setPenyimpanan(this.getPenyimpanan() - pindahMemori);
        System.out.printf(
                "\nKarena transfer data, memori %s berkurang menjadi %dGB dan memori %s bertamabah menjadi %dGB\n",
                this.getName(), this.getPenyimpanan(), hpLain.getName(), hpLain.getPenyimpanan());
    }

    public void pemakaianBaterai(int lamaPakai) {
        this.setBaterai(this.getBaterai() - (lamaPakai * 10));
        System.out.printf("\nPemakaian %s selama %d menguras baterai sebanyak %d Persen, sehingga baterai tersisa %d\n",
                this.getName(), lamaPakai, lamaPakai * 10, this.getBaterai());
    }

    public void setName(String merek) {
        this.merek = merek;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setPenyimpanan(int penyimpanan) {
        this.penyimpanan = penyimpanan;
    }

    public void setBaterai(int baterai) {
        this.baterai = baterai;
    }

    public String getName() {
        return merek;
    }

    public int getHarga() {
        return harga;
    }

    public int getPenyimpanan() {
        return penyimpanan;
    }

    public int getBaterai() {
        return baterai;
    }
}
