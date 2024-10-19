package kz.bbarss.hrhelper.controller;

import kz.bbarss.hrhelper.db.entity.JobOffer;
import kz.bbarss.hrhelper.db.repository.JobOfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class JobOfferController {
    @Autowired
    private JobOfferRepository jobOfferRepository;

    @PostMapping("/createJobOffer")
    public void addJobOffer(@RequestBody JobOffer jobOffer) {
        jobOfferRepository.save(jobOffer);
    }

    @GetMapping("/jobOffers")
    public List<JobOffer> getJobOffers(@RequestBody List<String> tagIds) {
        return jobOfferRepository.findByTagIdsIn(tagIds);
    }
}
