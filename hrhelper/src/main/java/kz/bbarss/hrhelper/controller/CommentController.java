package kz.bbarss.hrhelper.controller;

import kz.bbarss.hrhelper.db.entity.Comment;
import kz.bbarss.hrhelper.db.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;

    @PostMapping("/createComment")
    public void addComment(@RequestBody Comment comment) {
        commentRepository.save(comment);
    }

    @GetMapping("/{targetId}/comments")
    public List<Comment> getUserComments(@PathVariable String targetId) {
        return commentRepository.findByTargetId(targetId);
    }
}
