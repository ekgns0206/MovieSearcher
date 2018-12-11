package dahun.co.kr.moviesearcher;

public class MovieInfo {
    private int imageId;
    private String name;
    private int score;
    private String year;
    private String director;
    private String actors;

    public MovieInfo(int imageId, String name, int score, String year, String director, String actors){
        this.imageId = imageId;
        this.name = name;
        this.score = score;
        this.year = year;
        this.director = director;
        this.actors = actors;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public String getActors() {
        return actors;
    }
}
