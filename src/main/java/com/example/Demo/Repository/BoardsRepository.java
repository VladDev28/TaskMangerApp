package com.example.Demo.Repository;

import com.example.Demo.entities.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardsRepository extends JpaRepository<Board, Long> {
    List<Board> findBycreatorID(Long user_id);
}
