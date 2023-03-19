import java.util.Scanner;

public class no4 {// nama class

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// deklarasi scanner
        System.out.print("Masukkan Judul Film : ");// input judul film
        String film = input.nextLine();
        input.close();
        uppercasefirstLetter(film);// panggil method uppercasefirstLetter
    }

    static void uppercasefirstLetter(String letter) { // buat/deklarasi method dengan parameter string array
        String[] aps = letter.split(" "); // split inputan untuk dimasukkan ke dalam array yang dipisahkan oleh spasi
        for (String n : aps) { // for each semua item dalam array
            String lower = n.substring(1).toLowerCase(); // lower case huruf kedua sampai akhir
            String Uper = n.substring(0, 1).toUpperCase(); // upper case huruf pertama
            System.out.print(Uper + lower + " "); // gabungkan huruf pertama dan yang lainnya allu cetak
        }
    }
}
