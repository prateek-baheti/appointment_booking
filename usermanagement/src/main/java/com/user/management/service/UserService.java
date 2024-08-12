package com.user.management.service;

import com.user.management.entity.UserDetails;

public interface UserService {
    public UserDetails registerUser(UserDetails userDetails);
    public boolean isUserAlreadyExist(String email);
}
