public class Film {
    String title;
    int duration;
    String director;
    String genre;
    String synopsis;

    public Film() {
    }

    public Film(String title, int duration, String director, String genre, String synopsis) {
        this.title = "John Wick";
        this.duration = 2;
        this.director = "Chad Stahelski";
        this.genre = "Action";
        this.synopsis = "John Wick ingin membalaskan dendamnya kepada orang yang membuatnya menjadi pembunuh bayaran";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void displayInfo() {
        System.out.println("-----------------------------------");
        System.out.println("Judul Film : " + getTitle());
        System.out.println("Durasi Film : " + getDuration() + "Jam");
        System.out.println("Director Film : " + getDirector());
        System.out.println("Genre Film : " + getGenre());
        System.out.println("Synopsis : " + getSynopsis());
        System.out.println("-----------------------------------");

    }
}