public class Main {
    public static void main(String[] args) {
        Film avatar = new Film();
        avatar.setDirector("James Cameron");
        avatar.setDuration(3);
        avatar.setGenre("Sci-fi");
        avatar.setSynopsis("Jake sully berperang melawan manusia bersama suku air");
        avatar.setTitle("Avatar The Way of Water");
        avatar.displayInfo();

        Film JWick = new Film("Harry Potter", 0, null, null, null);
        System.out.println("-----------------------------------");
        System.out.println("Judul Film : " + JWick.getTitle());
        System.out.println("Durasi Film : " + JWick.getDuration() + "Jam");
        System.out.println("Director Film : " + JWick.getDirector());
        System.out.println("Genre Film : " + JWick.getGenre());
        System.out.println("Synopsis : " + JWick.getSynopsis());
        System.out.println("-----------------------------------");

        Utils.displaySelfData();
    }

}
