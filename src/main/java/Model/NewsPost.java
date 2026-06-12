package Model;

import java.time.LocalDateTime;

public class NewsPost {

private Long id;
private String title;
private String content;
private String author;
//use localDateTime since stores date/time without timezone complications
private LocalDateTime datePosted;

//constructor
public NewsPost (Long id, String title, String content, String author, LocalDateTime datePosted){
    this.id = id;
    this.title = title;
    this.content = content;
    this.author = author;
    this.datePosted = datePosted;
}
//no args
public NewsPost(){}

//getters && setters


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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(LocalDateTime datePosted) {
        this.datePosted = datePosted;
    }
}
