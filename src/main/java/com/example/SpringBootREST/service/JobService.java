package com.example.SpringBootREST.service;

import com.example.SpringBootREST.model.JobPost;
import com.example.SpringBootREST.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class JobService {


    @Autowired
    private JobRepo repo;
    public void addJob(JobPost jobPost){
        repo.save(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return repo.findAll();
    }

    public JobPost getJob(int postId) {
        return repo.findById(postId).orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteById(postId);
    }

    public void load() {
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
                new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 3, List.of("Java", "Spring Boot")),
                new JobPost(2, "Python Developer", "Building API in python and ORM", 2, List.of("React", "Django", "Flask")),
                new JobPost(3, "React Developer", "Interact with API and Elegant code", 3, List.of("React", "Redux", "JavaScript")),
                new JobPost(4, "Angular Developer", "Angular Developer with 5 years of experience", 1, List.of("Angular", "TypeScript", "Firewall")),
                new JobPost(5, "Node Developer", "API Dev with Node", 4, List.of("Node", "Express", "JavaScript"))
        ));

        repo.saveAll(jobs);
    }

    public List<JobPost> search(String keyword) {
        return repo.findByPostProfileContainingOrPostDescContaining(keyword, keyword);
    }
}
