package kz.bbarss.hrhelper.controller;

import kz.bbarss.hrhelper.db.entity.Comment;
import kz.bbarss.hrhelper.db.entity.JobOfferTag;
import kz.bbarss.hrhelper.db.repository.JobOfferTagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class JobOfferTagController {
    @Autowired
    private JobOfferTagRepository jobOfferTagRepository;

    @PostMapping("/createJobOfferTag")
    public void addComment(@RequestBody JobOfferTag jobOfferTag) {
        jobOfferTagRepository.save(jobOfferTag);
    }

    @GetMapping("/jobOfferTags")
    public List<JobOfferTag> getJobOfferTags() {
        return jobOfferTagRepository.findAll();
    }

    @GetMapping("/jobOfferTags/{id}")
    public JobOfferTag getJobOfferById(@PathVariable String id) {
        return jobOfferTagRepository.findById(id).orElse(null);
    }
}
