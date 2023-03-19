import java.util.Scanner;

/**
 * no5
 */
public class no5 { // main class
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(""); // input angka yang akan dikonversi menjadi tanggal dalam tbentuk string karena
                              // terdapat "-"
        String number = input.nextLine();
        int uleng = Integer.parseInt(number.substring(3, 5)); // slice bulan lalu konveris menjadi angka
        int tanggal = Integer.parseInt(number.substring(0, 2)); // slice bulan lalau konversi mnejadi angka
        if (tanggal <= 31 && uleng <= 12) { // conditional statement jika inputan tanggal melebihi 31 dan bulan melebihi
                                            // 12
            dateconvert(number);
        } else {
            System.out.println("Masukkan tanggal yang benar");
        }
        input.close();
    }

    static void dateconvert(String angka) { // deklarasikan method
        int tgl = Integer.parseInt(angka.substring(0, 2)); // slice tanggal lalu konversi nmenjadi angka

        String Bulan = angka.substring(3, 5); // slice bulan lalu konversi jadi angka
        if (Bulan.equals("01")) { // conditional statement untuk konversi angka bulan menjadi nama bulan
            Bulan = "Januari";
        } else if (Bulan.equals("02")) {
            Bulan = "Februari";
        } else if (Bulan.equals("03")) {
            Bulan = "Maret";
        } else if (Bulan.equals("04")) {
            Bulan = "April";
        } else if (Bulan.equals("05")) {
            Bulan = "Mei";
        } else if (Bulan.equals("06")) {
            Bulan = "Juni";
        } else if (Bulan.equals("07")) {
            Bulan = "Juli";
        } else if (Bulan.equals("08")) {
            Bulan = "Agustus";
        } else if (Bulan.equals("09")) {
            Bulan = "September";
        } else if (Bulan.equals("10")) {
            Bulan = "Oktober";
        } else if (Bulan.equals("11")) {
            Bulan = "November";
        } else if (Bulan.equals("12")) {
            Bulan = "Desember";
        }

        int tahun;
        // conditional statement untuk ubah angka terakhir menjadi tahun yang benar
        // (2000an atau 1900an)
        if (Integer.parseInt(angka.substring(6)) >= 0 && Integer.parseInt(angka.substring(6)) <= 23) {
            tahun = (Integer.parseInt(angka.substring(6))) + 2000;
        } else {
            tahun = (Integer.parseInt(angka.substring(6))) + 1900;
        }

        System.out.printf("%d %s %d", tgl, Bulan, tahun); // cetak tanggalnya dengan print format
    }
}
