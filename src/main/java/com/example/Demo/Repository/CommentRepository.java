package com.example.Demo.Repository;

import com.example.Demo.entities.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comments, Long> {
    List<Comments> findByTask_id(Long task_id);
}
