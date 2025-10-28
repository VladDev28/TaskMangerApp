package com.example.Demo.Repository;

import com.example.Demo.entities.TaskList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskListRepository extends JpaRepository<TaskList, Long> {
    List<TaskList> findByBoard_Id(Long board_id);

}
