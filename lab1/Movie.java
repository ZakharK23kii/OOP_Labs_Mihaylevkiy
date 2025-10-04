package lab1;

public class Movie {
    private String title;
    private MovieGenre genre;
    private Director director;

    public Movie() {
        title = "";
        this.genre = MovieGenre.DRAMA;
        this.director = new Director();

    }

    public Movie(String title, MovieGenre genre, Director director) {
        this.title = title;
        this.genre = genre;
        this.director = director;
    }


    public void printInfo() {
        System.out.println("Title: %s, Genre: %s".formatted(title, genre));
        director.printInfo();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}