package Controller;

import Model.Event;
import org.jspecify.annotations.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    private Long nextId = 1L;
    private List<Event> events = new ArrayList<>();

    @GetMapping
    public List<Event> getAllEvents(){
        return events;
    }

    @PostMapping
    public Event createEvent(@RequestBody @NonNull Event createEvent){
        createEvent.setId(nextId++);
        events.add(createEvent);
        return createEvent;
    }

    @PutMapping("/{id}")
    public Event updateEvent(@PathVariable Long id, @RequestBody Event updateEvent) {
        for (int i = 0; i < events.size(); i++) {
            Event event = events.get(i);
            if (event.getId().equals(id)) {
                event.setTitle(updateEvent.getTitle());
                event.setDescription(updateEvent.getDescription());
                event.setEventDate(updateEvent.getEventDate());
                event.setLocation(updateEvent.getLocation());
                return event;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public Event deleteEvent(@PathVariable Long id) {
        for (int i = 0; i < events.size(); i++) {
            Event event = events.get(i);
            if (event.getId().equals(id)) {
                events.remove(i);
                return event;
            }
        }
        return null;
    }
}
