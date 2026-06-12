package Controller;

import Model.Resources;
import org.jspecify.annotations.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/resources")
public class ResourcesController {

    private Long nextId = 1L;
    private List<Resources> resources = new ArrayList<>();

    @GetMapping
    public List<Resources> getAllResources(){
        return resources;
    }

    @PostMapping
    public Resources createResource(@RequestBody @NonNull Resources createResource){
        createResource.setId(nextId++);
        resources.add(createResource);
        return createResource;
    }

    @PutMapping("/{id}")
    public Resources updateResource(@PathVariable Long id, @RequestBody Resources updateResource) {
        for (int i = 0; i < resources.size(); i++) {
            Resources resource = resources.get(i);
            if (resource.getId().equals(id)) {
                resource.setTitle(updateResource.getTitle());
                resource.setUrl(updateResource.getUrl());
                resource.setDescription(updateResource.getDescription());
                resource.setCategory(updateResource.getCategory());
                return resource;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public Resources deleteResource(@PathVariable Long id) {
        for (int i = 0; i < resources.size(); i++) {
            Resources resource = resources.get(i);
            if (resource.getId().equals(id)) {
                resources.remove(i);
                return resource;
            }
        }
        return null;
    }
}
