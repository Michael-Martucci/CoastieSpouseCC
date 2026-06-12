package Model;

public class Event {

    private Long id;
    private String title;
    private String description;
    private String eventDate;
    private String location;

    //constructor
    public Event(Long id, String title, String description, String eventDate, String location){
        this.id = id;
        this.title = title;
        this.description = description;
        this.eventDate = eventDate;
        this.location = location;
    }

    //no args
    public Event(){}

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
