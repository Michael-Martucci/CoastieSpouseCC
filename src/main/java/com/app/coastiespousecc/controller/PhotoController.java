package com.app.coastiespousecc.controller;

import com.app.coastiespousecc.model.Photo;
import org.jspecify.annotations.NonNull;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/photos")
public class PhotoController {

    private Long nextId = 1L;
    private List<Photo> photos = new ArrayList<>();

    @GetMapping
    public List<Photo> getAllPhotos(){
        return photos;
    }

    @PostMapping
    public Photo createPhoto(@RequestBody @NonNull Photo createPhoto){
        createPhoto.setId(nextId++);
        createPhoto.setUploadedDate(LocalDateTime.now());
        photos.add(createPhoto);
        return createPhoto;
    }

    @PutMapping("/{id}")
    public Photo updatePhoto(@PathVariable Long id, @RequestBody Photo updatePhoto) {
        for (int i = 0; i < photos.size(); i++) {
            Photo photo = photos.get(i);
            if (photo.getId().equals(id)) {
                photo.setTitle(updatePhoto.getTitle());
                photo.setImageUrl(updatePhoto.getImageUrl());
                photo.setUploadedDate(LocalDateTime.now());
                return photo;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public Photo deletePhoto(@PathVariable Long id) {
        for (int i = 0; i < photos.size(); i++) {
            Photo photo = photos.get(i);
            if (photo.getId().equals(id)) {
                photos.remove(i);
                return photo;
            }
        }
        return null;
    }
}
