package applicaion;

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
}
