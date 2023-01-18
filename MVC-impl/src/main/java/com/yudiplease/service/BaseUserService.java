package com.yudiplease.service;

import com.yudiplease.exception.UserNotFoundException;
import com.yudiplease.repository.UserRepository;
import com.yudiplease.util.mapper.UserMapper;
import dto.request.UserRequest;
import dto.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BaseUserService implements UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    @Override
    public void createUser(UserRequest request) {
        repository.save(mapper.toEntity(request));
    }

    @Override
    public UserResponse updateUser(UUID userId, UserRequest request) {
        return null;
    }

    @Override
    public void deleteUserById(UUID userId) {
        repository.deleteById(userId);
    }

    @Override
    public UserResponse getUserById(UUID userId) {
        return repository.findById(userId)
                .map(mapper::toResponse)
                .orElseThrow(() -> new UserNotFoundException(userId));
    }

    @Override
    public List<UserResponse> getUsers() {
        return repository.findAll().stream().map(mapper::toResponse).toList();
    }
}

