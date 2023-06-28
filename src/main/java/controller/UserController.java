package controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.UserService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("users")
    List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @PostMapping("user")
    public String addUser(@RequestBody User user)
    {
        return userService.createUser(user);
    }

    @GetMapping("user/{id}")
   public String getUserByID(@PathVariable Integer userID){
        return userService.getUser(userID);
   }


}
