import java.util.Scanner;

public class no7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // buat array nama kendaraan
        String[] kendaraan = { "mobil", "becak", "bentor", "pesawat", "sepeda", "kereta", "motor", "kapal", "perahu" };
        System.out.print(""); // input nama kendaraan yang akan dicari indexnya
        String cek = input.nextLine().toLowerCase(); // ubah inputan agar menjadi semua lowercase
        findIndex(cek, kendaraan); // panggil methodnya
        input.close();
    }

    static void findIndex(String text, String[] lis) { // buat methode findIndex
        int index = -1; // buat nilai index default -1 karena jika tidak ditemukan indexnya -1
        for (int i = 0; i < lis.length; i++) { // perulangan sepanjang panjang array
            // conditional statement juntuk cek apakah array index i sama dengan inputan
            if (lis[i].equals(text)) {
                index = i; // nilai index berubah jadi i jika conditional statementnya bernilai benar
                break; // hentikan perulanhgannya
            }
        }
        System.out.println(index); // cetak nilai index
    }
}
