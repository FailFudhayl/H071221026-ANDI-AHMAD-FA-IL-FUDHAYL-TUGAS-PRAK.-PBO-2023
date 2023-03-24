package NO3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User fail = new User("Fa'il", 20000);
        Product lenovo = new Product("Lenovo Legion 5 Pro", 20000, 10);
        Product msi = new Product("MSI Bravo 15", "15k", 15);
        Product tuf = new Product("ASUS TUF GAMING", "10K", 5);
        Product rog = new Product("ASUS ROG ZEPHIRUS", 5000, 2);
        Store toko = new Store("MC STORE");
        toko.tambahProduct(lenovo);
        toko.tambahProduct(msi);
        toko.tambahProduct(tuf);
        toko.tambahProduct(rog);
        while (true) {
            // try {
            fail.card();
            toko.listProduct();
            System.out.println("O. Keluar");
            // System.out.println(rog.getStock());
            System.out.print("> ");
            try {
                int pilihan = input.nextInt();
                if (pilihan <= 0) {
                    break;
                } else {
                    toko.konfirmasi(pilihan - 1);
                }
                System.out.print("> ");
                int pil = input.nextInt();
                if (pil == 1) {
                    toko.transaksi(pilihan - 1, fail);
                    System.out.print("> ");
                    int yatid = input.nextInt();
                    if (yatid == 1) {
                        continue;
                    } else {
                        break;
                    }
                } else {
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Masukkan data yang benar");
            }

            // } catch (Exception e) {
            // System.out.println("Masukkan angka/pilihan yang benar");
            // }

        }
        input.close();
    }
}
