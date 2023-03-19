public class Main {
    public static void main(String[] args) {
        // beri nilai pada atribut
        Cuboid cuboid = new Cuboid();
        cuboid.height = 10;
        cuboid.weight = 15;
        cuboid.length = 30;
        // cetak dan panggil methode menghotung volume
        System.out.printf("Voulume = %.2f", cuboid.getVolume());
    }
}
