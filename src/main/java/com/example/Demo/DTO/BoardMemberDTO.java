package com.example.Demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardMemberDTO {
    private Long id;
    private Long board_id;
    private Long user_id;
    private String role;
}
