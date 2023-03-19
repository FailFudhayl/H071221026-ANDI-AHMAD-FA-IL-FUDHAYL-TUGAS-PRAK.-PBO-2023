public class Main {
    public static void main(String[] args) {
        Footballer ronaldo = new Footballer(); // deklarasikan objek untuk class Footballer
        // berikan nilai setiap atribute
        ronaldo.nama = "Cristiano Ronaldo";
        ronaldo.club = "AL-NASSR";
        ronaldo.nopung = 7;
        ronaldo.juaraapa = "UEFA CHAMPIONS LEAGUE";
        ronaldo.berapakalijuara = 5;
        ronaldo.kecepatan = 2;
        ronaldo.tendangan = 10;
        // panggil methode player_profile dn player_atribute
        ronaldo.player_profile();
        ronaldo.player_atribute();
    }
}
