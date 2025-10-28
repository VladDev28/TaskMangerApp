package com.example.Demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskAssignmentDto {
    private Long id;
    private Long task_id;
    private Long user_id;
}
