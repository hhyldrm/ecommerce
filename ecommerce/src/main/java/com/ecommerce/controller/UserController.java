package com.ecommerce.controller;

import com.ecommerce.dto.CreateUserRequest;
import com.ecommerce.dto.UpdateUserRequest;
import com.ecommerce.dto.UsersDto;
import com.ecommerce.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/getAll")
    public ResponseEntity<List<UsersDto>> getallUser(){
        return ResponseEntity.ok(userService.getAllUser());
    }

    @GetMapping("/{mail}")
    public ResponseEntity<UsersDto> getUserByEmail(@PathVariable("mail") String mail){
       return ResponseEntity.ok(userService.getUserByMail(mail));
    }

    @PostMapping("/put")
    public ResponseEntity<UsersDto> createUser(@RequestBody CreateUserRequest request){
        return ResponseEntity.ok(userService.createUser(request));
    }
    @PutMapping("/{mail}")
    public ResponseEntity<UsersDto> updateUser(@PathVariable("mail") String mail, @RequestBody UpdateUserRequest request){
        return ResponseEntity.ok(userService.updateUser(mail,request));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void>deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/mail/{email}")
    public ResponseEntity<Void>deleteUserByMail(@PathVariable("email") String email){
        userService.deleteUserByMail(email);
        return ResponseEntity.ok().build();
    }



}
