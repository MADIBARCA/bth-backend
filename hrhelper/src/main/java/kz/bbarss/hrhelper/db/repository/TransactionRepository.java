package kz.bbarss.hrhelper.db.repository;

import kz.bbarss.hrhelper.db.entity.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TransactionRepository extends MongoRepository<Transaction, String> {
    @Query("{ $or: [ { 'authorId': ?0 }, { 'targetId': ?0 } ] }")
    List<Transaction> findByAuthorIdOrTargetId(String userId);
}
