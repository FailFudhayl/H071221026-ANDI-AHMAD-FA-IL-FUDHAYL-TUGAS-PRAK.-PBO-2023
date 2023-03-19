public class Main {
    public static void main(String[] args) {
        Produk produk1 = new Produk("001", "Teh Pucuk Harum", 10, 3000); // buat objek lalu isi atributenya

        if (produk1.cek_stok()) { // buat conditional statement jika porduk tersedia
            System.out.println("Stok " + produk1.getNama() + " tersedia");
        } else {
            System.out.println("Stok " + produk1.getNama() + " habis");
        }

        produk1.detail_produk();

        Produk produk2 = new Produk("002", "Sprite Lemon Water", 0, 4500);

        if (produk2.cek_stok()) {
            System.out.println("Stok " + produk2.getNama() + " tersedia");
        } else {
            System.out.println("Stok " + produk2.getNama() + " habis");
        }

        produk2.detail_produk();
    }
}
