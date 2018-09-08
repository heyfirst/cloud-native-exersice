package com.sit.cloudnative.cloudnative.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService implements UserServiceInterface{

    @Autowired
    private UserADOInterface userADO;

    public User getUserByID(int userId) {
        User user = userADO.getUserById(userId);
        return user;
    }

    public ArrayList<User> getAllUser(){
        ArrayList<User> users = userADO.getAllUser();
        return users;
    }
}
