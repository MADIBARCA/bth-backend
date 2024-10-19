package kz.bbarss.hrhelper.db.repository;

import kz.bbarss.hrhelper.db.entity.JobOfferTag;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobOfferTagRepository extends MongoRepository<JobOfferTag, String> {
}
