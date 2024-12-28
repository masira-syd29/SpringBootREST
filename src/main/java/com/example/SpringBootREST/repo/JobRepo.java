package com.example.SpringBootREST.repo;

import com.example.SpringBootREST.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {
    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);
}
//List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//        new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 3, List.of("Java", "Spring Boot")),
//        new JobPost(2, "Python Developer", "Building API in python and ORM", 2, List.of("React", "Django", "Flask")),
//        new JobPost(3, "React Developer", "Interact with API and Elegant code", 3, List.of("React", "Redux", "JavaScript")),
//        new JobPost(4, "Angular Developer", "Angular Developer with 5 years of experience", 1, List.of("Angular", "TypeScript", "Firewall")),
//        new JobPost(5, "Node Developer", "API Dev with Node", 4, List.of("Node", "Express", "JavaScript"))
//));
//
//public List<JobPost> getAllJobs() {
//    return jobs;
//}
//
//public void addJob(JobPost job) {
//    jobs.add(job);
//    System.out.println(jobs);
//}
//
//public JobPost getJob(int postId) {
//    for(JobPost job : jobs){
//        if(job.getPostId() == postId)
//            return job;
//    }
//
//    return null;
//}
//
//public void updateJob(JobPost jobPost) {
//    for(JobPost jobPost1 : jobs){
//        if(jobPost1.getPostId() == jobPost.getPostId()){
//            jobPost1.setPostProfile(jobPost.getPostProfile());
//            jobPost1.setPostDesc(jobPost.getPostDesc());
//            jobPost1.setReqExperience(jobPost.getReqExperience());
//            jobPost1.setPostTechStack(jobPost.getPostTechStack());
//        }
//    }
//
//}
//
//public void deleteJob(int postId) {
//    for(JobPost jobPost : jobs){
//        if(jobPost.getPostId() == postId)
//            jobs.remove(jobPost);
//    }
//}

