package com.example.Spring_boot_rest.sevice;


import com.example.Spring_boot_rest.Repo.JobRepo;
import com.example.Spring_boot_rest.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JobService {


    @Autowired
    private JobRepo repo;

    public void addjob(JobPost jobPost){
        repo.addJob(jobPost);
    }

    public List<JobPost> getalljobs(){
       return  repo.getallJobs();
    }

    public JobPost getJob(int postId) {
        return repo.getJob(postId);
    }

    public void updateJob(JobPost jobPost) {
        repo.updateJob(jobPost);
    }

    public void deleteJob(int jobPostId) {
        repo.deleteJob(jobPostId);
    }
}
