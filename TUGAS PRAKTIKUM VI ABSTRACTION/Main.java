public class Main {
    public static void main(String[] args) {
        Siberian siberian_husky = new Siberian(1, 50);
        siberian_husky.describe();
        siberian_husky.move();
    }
}

abstract class Dog {
    protected int position;
    protected int averageLength;

    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getAverageLength() {
        return averageLength;
    }

    public void setAverageLength(int averageLength) {
        this.averageLength = averageLength;
    }

    abstract void move();

    abstract void describe();
}

class Pitbul extends Dog {

    public Pitbul(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void move() {
        setPosition(getPosition() + 3);
        System.out.println("pitbul bergerak 3 langkah ke kanan, posisi pitbul sekarang adalah " + getPosition()
                + " langkah di sebelah kanan");
    }

    @Override
    void describe() {
        System.out.println(
                "Pitbull memiliki kepala yang besar dan kuat, serta badan yang kuat dan atletis. Bulu Pitbull terdiri dari rambut pendek dan halus dengan berbagai warna yang berbeda, termasuk putih, hitam, coklat, dan abu-abu. panjang rata ratanya adalah "
                        + getAverageLength() + "cm");
    }

}

class Siberian extends Dog {

    public Siberian(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void move() {
        setPosition(getPosition() + 2);
        System.out.println(
                "Siberian Hsuky bergerak 2 langkah ke kanan, posisi siberian husky sekarang adalah " + getPosition()
                        + " langkah di sebelah kanan");
    }

    @Override
    void describe() {
        System.out.println(
                "Siberian Husky memiliki bulu tebal dan lebat yang memberikan perlindungan ekstra saat berada di lingkungan yang dingin. Warna bulu Siberian Husky bervariasi, mulai dari putih murni, hitam, abu-abu, coklat, hingga kombinasi warna-warna tersebut. panjnag rata ratnya adalah "
                        + getAverageLength() + "cm");
    }
}

class Bulldog extends Dog {

    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void move() {
        setPosition(getPosition() + 1);
        System.out.println("Bulldog bergerak 3 langkah ke kanan, posisi Bulldog sekarang adalah " + getPosition()
                + " langkah di sebelah kanan");
    }

    @Override
    void describe() {
        System.out.println(
                "Bulldog adalah salah satu ras anjing yang berasal dari Inggris. Ras anjing ini dikenal dengan kepala yang besar dan tubuh yang pendek dan gemuk. Bulldog memiliki karakteristik wajah yang khas dengan hidung yang pesek dan mulut yang lebar. Mereka memiliki kulit yang mengendur di sekitar kepala dan leher, serta bulu pendek dan halus yang umumnya berwarna putih, coklat, atau abu-abu. panjang rata ratanya adalah "
                        + getAverageLength() + "cm");
    }
}

class German extends Dog {

    public German(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void move() {
        setPosition(getPosition() + 3);
        System.out.println(
                "German Shepherd bergerak 3 langkah ke kanan, posisi German Sheperherd sekarang adalah " + getPosition()
                        + " langkah di sebelah kanan");
    }

    @Override
    void describe() {
        System.out.println(
                "German Shepherd, juga dikenal sebagai Alsatian, adalah salah satu ras anjing yang berasal dari Jerman. Ras anjing ini dikenal dengan kepandaian dan kecerdasannya yang tinggi, serta postur tubuh yang kuat dan atletis. German Shepherd memiliki bulu yang tebal dan halus, dan umumnya berwarna hitam, coklat, atau abu-abu. panjang rata ratanya adalah "
                        + getAverageLength() + "cm");
    }

}