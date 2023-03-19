import java.util.Scanner;

public class no6 {// main class
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float jari2;
        try { // try catch jika inputan bukan angka
            System.out.print("Masukkan jari jari : ");
            jari2 = input.nextFloat(); // input jari2
            input.nextLine();
            // cetak luas lingkaran dengan menggunakan print format
            System.out.printf("Luas Lingkaran : %.2f", 3.14 * jari2 * jari2);
        } catch (Exception e) {
            System.out.println("Masukkan angka");
        }
        input.close();
    }
}
