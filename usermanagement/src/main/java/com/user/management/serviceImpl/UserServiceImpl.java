package com.user.management.serviceImpl;

import com.user.management.Repository.UserRepository;
import com.user.management.entity.UserDetails;
import com.user.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails registerUser(UserDetails userDetails) {
        UserDetails userDetail=userRepository.save(userDetails);
        return userDetail;

    }

    @Override
    public boolean isUserAlreadyExist(String email) {
       return userRepository.existsByEmail(email);

    }

}
