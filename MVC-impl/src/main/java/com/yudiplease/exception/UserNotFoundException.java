package com.yudiplease.exception;

import java.util.UUID;

public class UserNotFoundException extends NotFoundException {
    public UserNotFoundException(UUID userId) {
        super(String.format("User with this id = %s, not found", userId));
    }
}
