package LLD_Question.BookMyShow;

import LLD_Question.BookMyShow.enums.Jounure;

import java.util.List;

public class Movies {
    int movieId;
    String name;
    int duration;
    Jounure jounure;
    int rating;
    List<Theatre> theatreList;

    public Movies(int movieId, String name, int duration, Jounure jounure, int rating, List<Theatre> theatreList) {
        this.movieId = movieId;
        this.name = name;
        this.duration = duration;
        this.jounure = jounure;
        this.rating = rating;
        this.theatreList = theatreList;
    }
}
