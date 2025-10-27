package com.example.Demo.Repository;

import com.example.Demo.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByTaskList_Id(Long list_id);
    List<Task> findByCreatedBy_Id(Long user_id);
}
