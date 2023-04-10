import java.util.ArrayList;
import java.util.Scanner;
import models.Profile;
import models.User;
import utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Memanggil method runApp();
        runApp();
    }

    private static void runApp() {
        // Menu Utama Aplikasi
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");
        // Menginput pilihan menu
        int selectMenu = sc.nextInt();
        sc.nextLine();
        switch (selectMenu) {
            case 1:
                // Membuka Halaman Login
                showLoginMenu();
                break;
            case 2:
                // Membuka Halaman Register
                showRegisterMenu();
            default:
                // Mengulang Pemanggilan Menu Utama
                runApp();
        }
    }

    private static void showLoginMenu() {
        // Halaman Login
        System.out.println("-------------------------");
        System.out.println("Login");
        // Menginput Username dan Menyimpannya di attribute username;
        System.out.println("Masukkan Username");
        System.out.print("> ");

        String username = sc.next();
        // Membuat variabel userIndex yang mana nanti akan menampung index dari user
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUsername().equals(username)) {
                userIndex = i;
                break;
            }
        }
        // Saat userIndex tidak sama dengan -1 atau userIndexnya ditemukan
        if (userIndex != -1) {
            // Menginput Password
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.next();

            /*
             * 
             * Mengecek apakah password dari User yang login berdasarkan username
             * sama dengan password yang diinput sebelumnya, kemudian simpan
             * hasilnya di variabel isPasswordMatch
             */
            boolean isPasswordMatch = false;
            if (listUser.get(userIndex).getPassword().equals(password)) {
                isPasswordMatch = true;
            }

            // Jika passwordnya sama maka berhasil login
            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                /*
                 * 
                 * panggil method showDetailUser dan kirimkan data Profile User yang login
                 */
                showDetailUser(listUserProfile.get(userIndex));
                System.exit(0);
            } else {
                // saat password salah akan menampikan password salah
                System.out.println("Password Salah");
            }
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");
        // Menginput username dan password

        String username, password;
        while (true) {
            System.out.println("Username");
            System.out.print("> ");
            username = sc.nextLine();
            System.out.println("Password");
            System.out.print("> ");
            password = sc.nextLine();
            boolean isUsernameExist = false;
            if (!password.isBlank() && !username.isBlank() && password.length() >= 8) {
                if (listUser.isEmpty()) {
                    break;
                }
                for (User user : listUser) {
                    if (user.getUsername().equals(username)) {
                        System.out.println("Username telah digunakan!");
                        isUsernameExist = true;
                        break;
                    }
                }
                if (!isUsernameExist) {
                    break;
                }
            } else {
                System.out.println(
                        "Username atau password tidak boleh kosong dan password tidak boleh kurang dari 8 karakter");
            }
        }

        User user = new User(username, password);

        Profile profile = new Profile();

        // Menginput Data Profile
        int age = 0;
        String fullName, hobby;
        boolean x = false;
        while (true) {
            System.out.println("Nama Lengkap");
            System.out.print("> ");
            fullName = sc.nextLine();
            try {
                System.out.println("Umur");
                System.out.print("> ");
                age = sc.nextInt();
                x = true;
            } catch (Exception e) {
                System.out.println("Umur harus berupa angka!");
            }
            sc.nextLine();
            System.out.println("Hobby");
            System.out.print("> ");
            hobby = sc.nextLine();
            if (!hobby.isBlank() && !fullName.isBlank() && x) {
                break;
            }
            System.out.println("Nama, Hobby, atau, umur tidak boleh kosong!");
        }

        /*
         * 
         * Berikan nilai fullName, age, dan hobby ke objek profile yang telah
         * di Instance sebelumnya. Nilai ini diperoleh dari data profile yang
         * diinput sebelumnya
         */
        profile.setName(fullName);
        profile.setHobby(hobby);
        profile.setAge(age);

        /*
         * 
         * Berikan nilai nickName ke objek profile,
         * Nilai ini diperoleh menggunakan static method yang dibuat di class
         * StringUtils, dengan mengirimkan fullName yang diinput sebelumnya
         */
        profile.setNickName(StringUtils.nickName(profile.getName()));

        // Menambahkan user yang dibuat ke list user
        listUser.add(user);
        // Menambahkan profile user yang dibuat ke list profile
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        /*
         * *
         * Tampilkan semua data profile user yang login
         */
        System.out.println("Nama : " + profile.getName());
        System.out.println("Nickname : " + profile.getNickName());
        System.out.println("Hobby : " + profile.getHobby());
        System.out.println("Umur : " + profile.getAge());

    }
}
