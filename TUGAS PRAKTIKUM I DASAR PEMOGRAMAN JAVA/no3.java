import java.util.Scanner; //import library untuk scanner

public class no3 { // buat public class untuk menuliskan kode
    public static void main(String[] args) { // mothod main berisi baris kode yang akan dieksekusi pertama kali
        Scanner input = new Scanner(System.in); // deklarasikan input agar bisa memasukkan inputan
        String nama, hobby;
        int umur;
        try {// buat try catch jika inputan tidak sesuai tipe data
            System.out.print("Name : ");
            nama = input.nextLine();// input nama
            System.out.print("Umur : ");
            umur = input.nextInt();// input umur
            input.nextLine();
            System.out.print("Hobby : ");
            hobby = input.nextLine(); // input hobi
            System.out.printf("Nama saya %s, %s tahun, hobby %s", nama, umur, hobby);
        } catch (Exception e) {
            System.out.println("Masukkan angka di bagian umur");
        }
        input.close();
    }
}
