package nl.ceesgribnau.javaAdvanced.model;

public class review {
    private long id;
    private String title;
    private String description;
    private int rating;

    public review() {
    }

    public review(long id, String title, String description, int rating) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
