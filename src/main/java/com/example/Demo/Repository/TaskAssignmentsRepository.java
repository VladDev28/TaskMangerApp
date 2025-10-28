package com.example.Demo.Repository;

import com.example.Demo.entities.TaskAssignment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskAssignmentsRepository extends JpaRepository<TaskAssignment, Long> {
    List<TaskAssignment> findByTask_Id(Long task_id);
    List<TaskAssignment> findByUser_Id(Long user_id);
    boolean existsByTask_Id_User_Id(Long task_id, Long user_id);
}
