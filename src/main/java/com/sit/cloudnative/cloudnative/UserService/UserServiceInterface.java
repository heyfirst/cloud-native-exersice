package com.sit.cloudnative.cloudnative.UserService;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface UserServiceInterface {
    User getUserByID(int userId);
    ArrayList<User> getAllUser();
}
