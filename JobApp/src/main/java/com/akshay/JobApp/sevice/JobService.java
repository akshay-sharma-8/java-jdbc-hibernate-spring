package com.akshay.JobApp.sevice;

import com.akshay.JobApp.Repo.JobRepo;
import com.akshay.JobApp.model.JobPost;
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
}
