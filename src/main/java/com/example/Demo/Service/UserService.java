package com.example.Demo.Service;

import com.example.Demo.DTO.LoginRequest;
import com.example.Demo.DTO.RegisterRequest;
import com.example.Demo.DTO.UserResponse;

public interface UserService {
    UserResponse register(RegisterRequest request);
    String login(LoginRequest request);
}
