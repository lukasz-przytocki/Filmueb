package data;

public class Movie {
    String movieName;
    Actor director;
    int productionYear;
    String filmGenre;
    String movieDescription;
    String movieRating;

    public Movie(String movieName, Actor director, int productionYear, String filmGenre, String movieDescription, String movieRating) {
        this.movieName = movieName;
        this.director = director;
        this.productionYear = productionYear;
        this.filmGenre = filmGenre;
        this.movieDescription = movieDescription;
        this.movieRating = movieRating;
    }
}
