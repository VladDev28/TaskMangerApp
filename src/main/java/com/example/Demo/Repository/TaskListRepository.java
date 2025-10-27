package com.example.Demo.Repository;

import com.example.Demo.entities.TaskLists;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskListRepository extends JpaRepository<TaskLists, Long> {
    List<TaskLists> findByBoard_Id(Long board_id);

}
