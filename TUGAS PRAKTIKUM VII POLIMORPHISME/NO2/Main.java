package NO2;

public class Main {
        public static void main(String[] args) {
                Product<Integer> produk1 = new Product<>("Kinder Joy", 10000, "2023-05-01");
                Product<String> produk2 = new Product<>("Sari Roti", "Rp. 15.000", "2023-05-20");
                Product<Double> produk3 = new Product<>("Susu Kurma", 7.5, "2023-06-01");

                System.out.println(
                                "Product 1 : " + produk1.getName() + " - " + produk1.getPrice() + " - "
                                                + produk1.getExpiryDate());
                System.out.println(
                                "Product 2 : " + produk2.getName() + " - " + produk2.getPrice() + " - "
                                                + produk2.getExpiryDate());
                System.out.println(
                                "Product 3 : " + produk3.getName() + " - " + produk3.getPrice() + " - "
                                                + produk3.getExpiryDate());
        }
}
