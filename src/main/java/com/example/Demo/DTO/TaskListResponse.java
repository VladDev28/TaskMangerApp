package com.example.Demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskListResponse {
    private Long id;
    private Long board_id;
    private String title;
    private Integer position;
}
