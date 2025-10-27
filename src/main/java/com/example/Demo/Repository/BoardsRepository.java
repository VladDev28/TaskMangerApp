package com.example.Demo.Repository;

import com.example.Demo.entities.Boards;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardsRepository extends JpaRepository<Boards, Long> {
    List<Boards> findBycreatorID(Long user_id);
}
