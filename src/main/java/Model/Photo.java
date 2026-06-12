package Model;

import java.time.LocalDateTime;

public class Photo {

    private Long id;
    private String title;
    private String imageUrl;
    private LocalDateTime uploadedDate;

    //constructor
    public Photo(Long id, String title, String imageUrl, LocalDateTime uploadedDate){
        this.id = id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.uploadedDate = uploadedDate;
    }

    //no args
    public Photo(){}

    //getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public LocalDateTime getUploadedDate() {
        return uploadedDate;
    }

    public void setUploadedDate(LocalDateTime uploadedDate) {
        this.uploadedDate = uploadedDate;
    }
}
