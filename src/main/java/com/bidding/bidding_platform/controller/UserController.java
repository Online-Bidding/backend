package com.bidding.bidding_platform.controller;
import java.util.List;
import com.bidding.bidding_platform.model.User;
import com.bidding.bidding_platform.service.UserService;
import com.bidding.bidding_platform.dto.UserUpdateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
@CrossOrigin("*") //Allow frontend to access backend
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return  userService.getAllUsers();
    }

//    @PostMapping
//    public void addNewUser(@RequestBody User user){
//        userService.insertUser(user);
//    }

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @GetMapping("{id}")
    public User getSingleUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @PutMapping("{id}")
    public User updateSingleUser(@PathVariable Integer id,
                                                   @RequestBody UserUpdateRequest request){
        return userService.updateUserById(id, request);
    }
}
