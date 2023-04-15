package NO1;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    public static void runApp() {
        try {
            System.out.println("===========================");
            System.out.println("PILIH JENIS BANGUN");
            System.out.println("===========================");
            System.out.println("1. Bangun Ruang");
            System.out.println("2. Bangun Datar");
            System.out.print("> ");
            int selectMenu = sc.nextInt();
            sc.nextLine();
            switch (selectMenu) {
                case 1:
                    showBangunruang();
                    break;
                case 2:
                    showBangundatar();
                    break;
                default:
                    runApp();
            }
        } catch (Exception e) {
            System.out.println("Masukkan inputan angka");
        }
    }

    public static void showBangunruang() {
        try {
            System.out.println("===========================");
            System.out.println("PILIH BANGUN RUANG");
            System.out.println("===========================");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Bola");
            System.out.println("4. Tabung");
            System.out.print("> ");
            int pilihRuang = sc.nextInt();
            sc.nextLine();

            if (pilihRuang == 1) {
                System.out.print("Sisi : ");
                Double sisiKubus = sc.nextDouble();
                sc.nextLine();
                Kubus kubus = new Kubus(sisiKubus);
                kubus.hitungLuas();
                kubus.hitungVolume();
            } else if (pilihRuang == 2) {
                System.out.print("Panjang : ");
                Double panjangBalok = sc.nextDouble();
                sc.nextLine();

                System.out.print("Lebar : ");
                Double lebarBalok = sc.nextDouble();
                sc.nextLine();

                System.out.print("Tinggi : ");
                Double tinggiBalok = sc.nextDouble();
                sc.nextLine();

                Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                balok.hitungLuas();
                balok.hitungVolume();
            } else if (pilihRuang == 3) {
                System.out.print("Jari Jari : ");
                Double jariBola = sc.nextDouble();
                sc.nextLine();

                Bola bola = new Bola(jariBola);
                bola.hitungLuas();
                bola.hitungVolume();
            } else if (pilihRuang == 4) {
                System.out.print("Jari Jari : ");
                Double jariTabung = sc.nextDouble();
                sc.nextLine();

                System.out.print("Tinggi : ");
                Double tinggTabung = sc.nextDouble();
                sc.nextLine();

                Tabung tabung = new Tabung(jariTabung, tinggTabung);
                tabung.hitungLuas();
                tabung.hitungVolume();
            } else {
                System.out.println("Masukkan inputan yang benar");
                showBangunruang();
            }
        } catch (Exception e) {
            System.out.println("Masukkan inputan angka");
        }

    }

    public static void showBangundatar() {
        try {
            System.out.println("===========================");
            System.out.println("PILIH BANGUN DATAR");
            System.out.println("===========================");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("4. Segitiga");
            System.out.println("5. Trapesium");
            System.out.print("> ");
            int pilihDatar = sc.nextInt();
            sc.nextLine();

            if (pilihDatar == 1) {
                System.out.print("Sisi : ");
                Double sisiPersegi = sc.nextDouble();
                sc.nextLine();

                Persegi persegi = new Persegi(sisiPersegi);
                persegi.hitungLuas();
                persegi.hitungKeliling();
            } else if (pilihDatar == 2) {
                System.out.print("Panjang : ");
                Double panajngPersegi = sc.nextDouble();
                sc.nextLine();

                System.out.print("Lebar: ");
                Double lebarPersegi = sc.nextDouble();
                sc.nextLine();

                PersegiPanjang persegiPP = new PersegiPanjang(panajngPersegi, lebarPersegi);
                persegiPP.hitungLuas();
                persegiPP.hitungKeliling();
            } else if (pilihDatar == 3) {
                System.out.print("Jari Jari : ");
                Double jariLingkaran = sc.nextDouble();
                sc.nextLine();

                Lingkaran lingkaran = new Lingkaran(jariLingkaran);
                lingkaran.hitungLuas();
                lingkaran.hitungKeliling();
            } else if (pilihDatar == 4) {
                System.out.print("Sisi : ");
                Double sisiLingkaran = sc.nextDouble();
                sc.nextLine();

                System.out.print("Tinggi : ");
                Double tinggiSegitiga = sc.nextDouble();
                sc.nextLine();

                Segitiga segitiga = new Segitiga(sisiLingkaran, tinggiSegitiga);
                segitiga.hitungLuas();
                segitiga.hitungKeliling();
            } else if (pilihDatar == 5) {
                System.out.print("Sisi Miring I : ");
                Double simir1 = sc.nextDouble();
                sc.nextLine();

                System.out.print("Sisi Miring II : ");
                Double simir2 = sc.nextDouble();
                sc.nextLine();

                System.out.print("Sisi Sejajar I : ");
                Double sijar1 = sc.nextDouble();
                sc.nextLine();

                System.out.print("Sisi Sejajar II : ");
                Double sijar2 = sc.nextDouble();
                sc.nextLine();

                System.out.print("Tinggi : ");
                Double tinggiTrapesium = sc.nextDouble();
                sc.nextLine();

                Trapesium trapesium = new Trapesium(simir1, simir2, sijar1, sijar2, tinggiTrapesium);
                trapesium.hitungLuas();
                trapesium.hitungKeliling();
            } else {
                System.out.println("Masukkan inputan yang benar");
                showBangundatar();
            }
        } catch (Exception e) {
            System.out.println("Masukkan inputan angka");
        }
    }
}
