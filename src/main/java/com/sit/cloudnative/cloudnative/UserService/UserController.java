package com.sit.cloudnative.cloudnative.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {

    @Autowired
    private UserServiceInterface userService;

    @RequestMapping(
            value="/users",
            method = RequestMethod.GET
    )
    public ResponseEntity<ArrayList<User>> getUserList() {
        ArrayList<User> users = userService.getAllUser();
        return new ResponseEntity(users, HttpStatus.OK);
    }

    @RequestMapping(
            value="/users/{user_id}",
            method = RequestMethod.GET
    )
    public ResponseEntity<User> getUserList(@PathVariable("user_id") int userId) {
        User user = userService.getUserByID(userId);
        return new ResponseEntity(user, HttpStatus.OK);
    }
}
