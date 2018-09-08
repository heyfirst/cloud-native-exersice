package com.sit.cloudnative.cloudnative.UserService;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface UserADOInterface {
    User getUserById(int userId);

    ArrayList<User> getAllUser();

}
