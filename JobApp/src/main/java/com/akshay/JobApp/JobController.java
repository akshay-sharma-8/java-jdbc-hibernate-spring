package com.akshay.JobApp;

import com.akshay.JobApp.model.JobPost;
import com.akshay.JobApp.sevice.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


// POST --> Create data
// GET --> Read data
// PUT --> Update data
// Delete --> Delete data


@Controller

public class JobController {


//    GET → only shows the page (read).
//
//    POST → actually sends data to the backend (write/submit).

    @Autowired
    private JobService service;

    @GetMapping({"/", "home"})
    public String home() {
        return "home";
    }


    @GetMapping("addjob")
    public String addJob() {
        return "addjob";
    }


    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        service.addjob(jobPost);
        return "success";

    }

    @GetMapping("viewalljobs")
    public String viewalljobs(Model model){
        List<JobPost> jobs = service.getalljobs();

        model.addAttribute("jobPosts" , jobs);

        return "viewalljobs";
    }



}
