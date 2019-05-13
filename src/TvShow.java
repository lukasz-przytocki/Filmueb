package data;

public class TvShow {
    String showName;
    int seasonsNumber;
    int episodesNumber;
    Actor producer;
    String showGenre;
    String showDescription;
    String showRating;

    public TvShow(String showName, int seasonsNumber, int episodesNumber, Actor producer, String showGenre, String showDescription, String showRating) {
        this.showName = showName;
        this.seasonsNumber = seasonsNumber;
        this.episodesNumber = episodesNumber;
        this.producer = producer;
        this.showGenre = showGenre;
        this.showDescription = showDescription;
        this.showRating = showRating;
    }
}
