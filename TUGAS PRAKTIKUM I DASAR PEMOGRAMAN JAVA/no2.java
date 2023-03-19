import java.util.Scanner; //import library untuk scanner

public class no2 { // buat public class untuk menuliskan kode
    public static void main(String[] args) { // mothod main berisi baris kode yang akan dieksekusi pertama kali
        Scanner input = new Scanner(System.in); // memanggil class scanner
        try {
            System.out.print("");
            int n = input.nextInt(); // input jumlah angka
            // method nextline untuk membatasi input di atas dan di bawah, karena jika tidak
            // diberi nextline maka input dibawah juga akan mengambil input di atas
            input.nextLine();
            System.out.print(""); // input angka angka
            String[] ars = input.nextLine().split(" "); // masukkan angka angka ke dalam array lalu displit
            if (ars.length == n) {
                int bulat = 0; // deklarasi variabel bil. bulat
                int desimal = 0; // deklarasi variabel bil.desimal
                for (String num : ars) { // buat perulangan untuk mengeluarkan item dalam array
                    try {
                        int i = Integer.parseInt(num); // konversi item dari string ke integer
                        bulat += 1; // jika berhasil dikonversi maka variabel bil.bulat bertambah 1
                    } catch (Exception e) {
                        // jika tadi eror atau bukan int tipe datanya maka akan langsung dikonversi ke
                        // double
                        double nomorkom = Double.parseDouble(num);
                        desimal += 1; // variabel desimal bertambah 1 jika berhasil dikonveris ke double
                    }
                }
                System.out.printf("%s Bilangan Bulat \n", bulat);// keluarkan jumlah bilangan bulat
                System.out.printf("%s Bilangan Desimal", desimal);// keluarkan jumlah bilangan desimal
            } else {
                System.out.println("Masukkan angka sesuai oanjang array yang ditentukan sebelumnya");
            }

        } catch (Exception e) {
            System.out.println("Masukkan angka");
        }
        input.close();
    }
}
