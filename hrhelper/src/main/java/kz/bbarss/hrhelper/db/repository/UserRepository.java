package kz.bbarss.hrhelper.db.repository;

import kz.bbarss.hrhelper.db.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByType(String type);
    @Query("{ 'tagIds': { $in: ?0 } }")
    List<User> findByTagIdsIn(List<String> tagIds);
}
