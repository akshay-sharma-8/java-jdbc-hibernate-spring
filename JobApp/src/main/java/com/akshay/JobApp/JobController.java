package com.akshay.JobApp;

import com.akshay.JobApp.model.JobPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobController {


//    GET → only shows the page (read).
//
//    POST → actually sends data to the backend (write/submit).

    
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

        return "success";

    }



}
