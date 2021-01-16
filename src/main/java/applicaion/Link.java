package applicaion;

import java.util.Objects;

public class Link {
    private String name;
    private String link;
    private String starsRating;
    private String rating;

    public Link(String name,String link,String starsRating,String rating ){
        this.name = name;
        this.link = link;
        this.starsRating = starsRating;
        this.rating = rating;

    }

    public String getLink() {
        return link;
    }

    public String getName() {
        return name;
    }

    public String getStarsRating() {
        return starsRating;
    }

    public String getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "----------------"+"\n"+" name:"+name+"\n"+
                   " link : "+link+"\n"+
                   "starRating :"+starsRating+"\n"+
                   " rating : "+rating;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Link)) return false;
        Link link1 = (Link) o;
        return Objects.equals(getName(), link1.getName()) &&
                Objects.equals(getLink(), link1.getLink()) &&
                Objects.equals(getStarsRating(), link1.getStarsRating()) &&
                Objects.equals(getRating(), link1.getRating());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLink(), getStarsRating(), getRating());
    }
}
