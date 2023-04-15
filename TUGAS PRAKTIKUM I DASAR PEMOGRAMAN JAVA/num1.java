import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("> ");
        int ukuran = input.nextInt();
        input.nextLine();

        System.out.print("> ");
        String[] list = input.nextLine().split(" ");
        if (list.length == ukuran) {
            int bulat = 0;
            int desimal = 0;

            for (String item : list) {
                try {
                    int digit = Integer.parseInt(item);
                    bulat += 1;
                } catch (Exception e) {
                    int decim = Integer.parseInt(item);
                    desimal += 1;
                }
            }

            System.out.println(" Jumlah Bulat : " + bulat);
            System.out.println("Jumlah Desimal : " + desimal);
        } else {
            System.out.println("Masukkan input sesuai dengan panjang");
        }
        input.close();
    }
}
