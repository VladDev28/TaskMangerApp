package com.example.Demo.Repository;

import com.example.Demo.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByTask_id(Long task_id);
}
