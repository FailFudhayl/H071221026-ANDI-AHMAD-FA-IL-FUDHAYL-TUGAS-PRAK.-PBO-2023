public class Produk{
    //deklarasikan atribut dari class
    private String id_produk;
    private String nama;
    private int stok;
    private int harga;

    //buat constructor
    public Produk(String idProduk, String namaNew, int stokNew, int hargaNew) {
        this.id_produk = idProduk;
        this.nama = namaNew;
        this.stok = stokNew;
        this.harga = hargaNew;
    }

    //buat method setter dan getter
    public void setId(String idProduk) {
        this.id_produk = idProduk;
    }

    public String getId() {
        return id_produk;
    }

    public void setNama(String namaNew) {
        this.nama = namaNew;
    }

    public String getNama() {
        return nama;
    }

    public void setStok(int stokNew) {
        this.stok = stokNew;
    }

    public int getStok() {
        return stok;
    }

    public void setHarga(int hargaNew) {
        this.harga = hargaNew;
    }

    public int getHarga() {
        return harga;
    }

    //method untuk mengecek apakah ada stok produk menggunakan conditional statement 
    public boolean cek_stok() {
        if (this.stok > 0) {
            return true;
        } else {
            return false;
        }
    }

    //buat method untuk menampilkan detail produk
    public void detail_produk() {
        System.out.printf("ID PRODUK : %s \n", this.id_produk);
        System.out.printf("NAMA PRODUK : %s \n", this.nama);
        System.out.printf("JUMLAH STOK PRODUK : %d \n", this.stok);
        System.out.printf("HARGA PRODUK : %d \n", this.harga);
        System.out.print(" \n");
    }
}