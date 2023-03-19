public class Footballer {
    String nama;
    String club;
    int nopung;
    String juaraapa;
    int berapakalijuara;
    int kecepatan;
    int tendangan;

    public void name_player(String name) {
        nama = name;
    }

    public void clubName(String klub) {
        club = klub;
    }

    public void back_number(int nopungs) {
        nopung = nopungs;
    }

    public void trophy_name(String pialaApa) {
        juaraapa = pialaApa;
    }

    public void titleNumber(int jumlahJuara) {
        berapakalijuara = jumlahJuara;
    }

    public void player_profile() {
        System.out.printf(
                "Halo nama saya %s, saya merupakan pemain sepak bola dengan nomor punggung %d di klub %s, saya telah juara %s sebak %d kali \n",
                nama, nopung, club, juaraapa, berapakalijuara);
    }

    public void speed(int speeds) {
        kecepatan = speeds;
    }

    public void shootPower(int shoot) {
        tendangan = shoot;
    }

    public void player_atribute() {
        System.out.printf("Kecepatan saya adalah %d km/jam dengan kekuatan tendangan %d km/jam \n", kecepatan,
                tendangan);
    }
}
