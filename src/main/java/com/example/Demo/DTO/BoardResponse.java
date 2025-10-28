package com.example.Demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardResponse {
    private Long id;
    private String name;
    private String description;
    private Long createdBy_Id;
    private LocalDateTime created_at;
}
