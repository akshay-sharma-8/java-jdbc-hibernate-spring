package com.example.Spring_boot_rest;


import com.example.Spring_boot_rest.model.JobPost;
import com.example.Spring_boot_rest.sevice.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
//@CrossOrigin tells Spring Boot:
//        “allow browsers to accept calls from another website (different domain/port).”

public class JobRestController {

    @Autowired
    private JobService service;


    @GetMapping(path="jobPosts", produces = {"application/xml"})
    //@ResponseBody // use with @Controller
   // @ResponseBody tells Spring “don’t look for an HTML page,
    // just send this object back as the HTTP response (usually JSON)”.
    public List<JobPost> getAllJobs(){
        return service.getalljobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId){
     return service.getJob(postId);
    }


//    @PostMapping("jobPost")
//    public void addJob(@RequestBody JobPost jobPost){
//        service.addjob(jobPost);
//    }

    @PostMapping(path = "jobPost" , consumes = {"application/json"})
    public JobPost addJob(@RequestBody JobPost jobPost){
        service.addjob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
       return service.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{jobpostId}")
    public String deleteJob(@PathVariable("jobpostId") int jobPostId){
        service.deleteJob(jobPostId);
        return "Deleted";
    }



}

//@PathVariable → identity of the resource (like user ID).
//Tells Spring to fetch the value of postId from the URL.
//PathVariable → mandatory part of the URL (/jobPost/101)

