package LLD_Question.BookMyShow;

import LLD_Question.BookMyShow.enums.City;

import java.util.List;
import java.util.Map;

public class TheatreController {
    Map<City,Theatre> theatreMap;
    List<Theatre> theatreList;

    public Map<City, Theatre> getTheatreMap() {
        return theatreMap;
    }

    public void setTheatreMap(Map<City, Theatre> theatreMap) {
        this.theatreMap = theatreMap;
    }

    public List<Theatre> getTheatreList() {
        return theatreList;
    }

    public void setTheatreList(List<Theatre> theatreList) {
        this.theatreList = theatreList;
    }
}
