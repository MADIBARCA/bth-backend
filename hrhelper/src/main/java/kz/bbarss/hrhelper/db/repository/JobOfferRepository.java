package kz.bbarss.hrhelper.db.repository;

import kz.bbarss.hrhelper.db.entity.JobOffer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface JobOfferRepository extends MongoRepository<JobOffer, String> {
    @Query("{ 'tagIds': { $in: ?0 } }")
    List<JobOffer> findByTagIdsIn(List<String> tagIds);
}
