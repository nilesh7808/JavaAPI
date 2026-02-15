package com.blog.apiservice.nileshBlog.Controller;

import com.blog.apiservice.nileshBlog.Entity.BlogEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/blogs")
public class BlogController {

    public Map<Long, BlogEntry> blogEntryMap = new HashMap<>();


    // Get all Entries
    @GetMapping("/details")
    public List<BlogEntry> getAllBlogs(){
        return new ArrayList<>(blogEntryMap.values());
    }

    // create a new entry
//    public ResponseEntity<BlogEntry> createBlogEntry(@RequestBody BlogEntry blogEntry){
//        blogEntryMap.put(blogEntry.getId(), blogEntry);
//        return new ResponseEntity<>(blogEntry, HttpStatus.OK);
//    }
    @PostMapping
    public String createBlogEntry(@RequestBody BlogEntry myBlogEntry){
        blogEntryMap.put(myBlogEntry.getId(), myBlogEntry);
        return "OK";
    }

    @GetMapping("details/{myId}")
    public BlogEntry findBlogEntryById(@PathVariable Long myId){
        return blogEntryMap.get(myId);
    }

    @DeleteMapping("/details/del/{myId}")
    public BlogEntry deleteEntryById(@PathVariable Long myId){
        return blogEntryMap.remove(myId);
    }

    @PutMapping("/details/update/{myId}")
    public BlogEntry updateBlogEntryById(@PathVariable Long myId, @RequestBody BlogEntry myUpdatedEntry){
        return blogEntryMap.put(myId, myUpdatedEntry);
    }

}
