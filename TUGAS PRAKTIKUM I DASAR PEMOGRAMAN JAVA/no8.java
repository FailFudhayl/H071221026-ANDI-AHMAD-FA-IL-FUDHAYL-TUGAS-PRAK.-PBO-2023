import java.util.Scanner;

public class no8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] duadimensi = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // buat array 2d
        int[] index = new int[2]; // buat array untuk menyimpan nilai index
        try { // buat try catch jika inputan bukan angka
            System.out.print("");
            int n = input.nextInt(); // input angka
            input.nextLine();
            index[0] = -1; // indeks default
            index[1] = -1; // indeks default
            // buat perulangan sepanjang panjang array
            for (int i = 0; i < duadimensi.length; i++) { // menggunakan nested karena array 2d
                for (int j = 0; j < duadimensi[i].length; j++) {
                    if (duadimensi[i][j] == n) { // conditional statement jika array index ij = inputan
                        // ubah nilai index menjadi i dan j
                        index[0] = i;
                        index[1] = j;
                        break; // hentikan perulangan
                    }
                }
            }
            if (index[0] == -1 && index[1] == -1) { // conditional statement jika inputan tidak ada dalam narray
                System.out.println("Masukkan angka yang terdapat dalam array dua dimensi");
            } else {
                System.out.println("Found " + n + " at [" + index[0] + "][" + index[1] + "]");
            }

        } catch (Exception e) {
            System.out.println("Masukkan angka");
        }
        input.close();
    }
}
