//package com.bidding.bidding_platform.service;
//
//import com.bidding.bidding_platform.dto.LoginRequest;
//import com.bidding.bidding_platform.model.User;
//import com.bidding.bidding_platform.repository.UserRepository;
//import com.bidding.bidding_platform.dto.UserUpdateRequest;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class UserService {
//    private final UserRepository userRepository;
//
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    public List<User> getAllUsers(){
//        return  userRepository.findAll();
//    }
//
////    public void insertUser(User user) {
////        userRepository.save(user);
////    }
//
//    public User registerUser(User user) {
//        Optional<User> existingUser = userRepository.findByEmail(user.getEmail());
//
//        if (existingUser.isPresent()) {
//            throw new RuntimeException("Email already registered");
//        }
//
//        return userRepository.save(user);
//    }
//
//    public User getUserById(Integer id) {
//        return userRepository.findById(id).orElseThrow(() -> new IllegalStateException(
//                id + " not found"
//        ));
//    }
//
//    public User updateUserById(Integer id, UserUpdateRequest request){
//        User user = userRepository.findById(id).orElseThrow(() -> new IllegalStateException(
//                id + " can't find a user with the id you entered"
//        ));
//
//        if (request.getName() != null) {
//            user.setName(request.getName());
//        }
//
//        if (request.getEmail() != null){
//            user.setEmail(request.getEmail());
//        }
//
//        if (request.getStatus() != null) {
//            user.setStatus(request.getStatus());
//        }
//
//        return userRepository.save(user);
//    }
//
//    public User loginUser(LoginRequest loginRequest) {
//        Optional<User> optionalUser = userRepository.findByEmail(loginRequest.getEmail());
//
//        if (optionalUser.isEmpty()) {
//            throw new RuntimeException("User not found with email " + loginRequest.getEmail());
//        }
//
//        User user = optionalUser.get();
//
//        if (!user.getPassword().equals(loginRequest.getPassword())) {
//            throw new RuntimeException("Incorrect password");
//        }
//
//        return user;
//    }
//}
