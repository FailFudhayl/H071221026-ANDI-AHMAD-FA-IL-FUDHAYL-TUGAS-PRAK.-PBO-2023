package NO1;

public class Main {
    public static void main(String[] args) {
        Handphone samsung = new Handphone("Samsung", 3000000, 5);
        Handphone nokia = new Handphone();
        samsung.upgradeMemori(3, 300000);

        samsung.transferData(nokia, 1);
        nokia.transferData(samsung, 1);

        samsung.pemakaianBaterai(5);
    }
}
