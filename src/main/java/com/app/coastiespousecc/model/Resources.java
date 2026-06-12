package com.app.coastiespousecc.model;

public class Resources {

    private Long id;
    private String title;
    private String url;
    private String description;
    private String category;

    //constructor
    public Resources(Long id, String title, String url, String description, String category){
        this.id = id;
        this.title = title;
        this.url = url;
        this.description = description;
        this.category = category;
    }

    //no args
    public Resources(){}

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
