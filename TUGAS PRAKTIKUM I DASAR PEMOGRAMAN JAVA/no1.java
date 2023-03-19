import java.util.Scanner; //import library untuk scanner

/**
 * no1
 */
public class no1 { // buat public class untuk menuliskan kode

    public static void main(String[] args) { // mothod main berisi baris kode yang akan dieksekusi pertama kali
        Scanner inpNIM = new Scanner(System.in); // memanggil class scanner
        String NIM; // deklarasi variabel NIM
        int soal;// deklarasi variabel soal
        System.out.print("NIM : "); // cetak "NIM : " untuk masukkan input
        NIM = inpNIM.next(); // method next digunakan untuk input kata
        // method substring untuk slice string nim sehingga hanya dua angka dibelekang
        // koma, method parseint utk konversi nim ke integer
        soal = Integer.parseInt(NIM.substring(7));
        // buat conditional statement jika habis dibagi 7 maka langsung cetak no.7, jika
        // tidak maka nomor soalnya adalah hasil modulus dengan 7 kemudian + 1
        if (soal % 7 == 0) {
            System.out.println("soal : no 7");
        } else {
            System.out.println("soal : no " + soal % 7);
        }
        inpNIM.close(); // tutup class scanner
    }
}
