package com.yudiplease.service;

import dto.request.UserRequest;
import dto.response.UserResponse;

import java.util.List;
import java.util.UUID;

public interface UserService {
    void createUser(UserRequest request);

    UserResponse updateUser(UUID userId, UserRequest request);

    void deleteUserById(UUID userId);

    UserResponse getUserById(UUID userId);

    List<UserResponse> getUsers();
}

