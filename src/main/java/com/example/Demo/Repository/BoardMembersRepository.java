package com.example.Demo.Repository;

import com.example.Demo.entities.Board_members;
import com.example.Demo.entities.TaskLists;

import java.util.List;

public interface BoardMembersRepository {
    List<Board_members> findBoardBy_Id(Long board_id);
    List<Board_members> findByUser_Id(Long user_id);
    boolean existsByBoard_Id_User_Id(Long board_id,Long user_id);

}
