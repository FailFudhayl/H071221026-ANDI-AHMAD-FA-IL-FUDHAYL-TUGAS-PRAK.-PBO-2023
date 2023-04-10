package utils;

public class StringUtils {
    /*
     * 
     * Buatlah sebuah method static yang akan
     * mengembalikan nickName berdasarkan fullName yang diberikan
     * aturan pembuatan nickName adalah :
     * 1. Jika fullName hanya 1 kata maka nickName = fullName
     * (ex: FullName = Agus, maka NickName = Agus)
     * 2. Jika fullName lebih dari 1 kata maka nickName adalah kata kedua dari
     * fullName
     * (ex: FullName = Eurico Devon, maka NickName = Devon)
     */
    public static void main(String[] args) {
        System.out.println(nickName("Andi Ahmad Fa'il Fudhayl"));
    }

    static public String nickName(String name) {
        String[] listname = name.split(" ");
        if (listname.length == 1) {
            name = listname[0];
        } else {
            name = listname[1];
        }
        return name;
    }
}
