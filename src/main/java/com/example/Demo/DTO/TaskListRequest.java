package com.example.Demo.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskListRequest {
    @NotNull(message = "Board id is required")
    private Long board_id;

    @NotNull(message = "Title is required")
    private String title;

    @NotNull(message = "Position is required")
    private Integer position;
}
