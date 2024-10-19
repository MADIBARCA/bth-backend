package kz.bbarss.hrhelper.db.repository;

import kz.bbarss.hrhelper.db.entity.Comment;
import kz.bbarss.hrhelper.db.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommentRepository extends MongoRepository<Comment, String> {
    List<Comment> findByTargetId(String targetId);
}
