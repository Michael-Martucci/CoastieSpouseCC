package com.app.coastiespousecc.controller;

import com.app.coastiespousecc.model.NewsPost;
import org.jspecify.annotations.NonNull;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/news")
public class NewsPostController {

    //use this to be able to increment user iDs with each new added
    private Long nextId = 1L;
    //store our newsPost objects in an Array list
    private List<NewsPost> newsPost = new ArrayList<>();

    @GetMapping
    public List <NewsPost> getAllNewsPosts(){
        return newsPost;
    }

    @PostMapping
    public NewsPost createNewsPost(@RequestBody @NonNull NewsPost createNewsPost){
        //increment user id each time one is added
        createNewsPost.setId(nextId++);
        //automatically set the date/time and not needed in JSON body.
        createNewsPost.setDatePosted(LocalDateTime.now());
        newsPost.add(createNewsPost);
            return createNewsPost;
    }

    //edit existing news post
    @PutMapping("/{id}")
    public NewsPost updateNewsPost(@PathVariable Long id, @RequestBody NewsPost updateNewsPost) {
        //Loop through all news post ids to return the id passed in the request parameter
        for (int i = 0; i < newsPost.size(); i++) {
            //return the via id set as i
            NewsPost post = newsPost.get(i);
            //confirm we have the correct news post requested
            if (post.getId().equals(id)) {
                //update each field with what is passed in the request (JSON)
                post.setTitle(updateNewsPost.getTitle());
                post.setContent(updateNewsPost.getContent());
                post.setAuthor(updateNewsPost.getAuthor());
                //use this to set the time to last modified
                post.setDatePosted(LocalDateTime.now());
                //return the news post updated data
                return post;
            }
        }
        //no existing user found for id in request.
        //update this to include HTTP status code and description
        return null;
    }

    //delete existing news post
    @DeleteMapping("/{id}")
    public NewsPost deleteNewsPost(@PathVariable Long id) {
        for (int i = 0; i < newsPost.size(); i++) {
            NewsPost post = newsPost.get(i);
            if (post.getId().equals(id)) {
                newsPost.remove(i);
                return post;
            }
        }
        //no existing news post
        return null;
    }
}
