package com.ecommerce.restapi.ecommercerestapi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.restapi.ecommercerestapi.Entites.user;
import com.ecommerce.restapi.ecommercerestapi.userService.userService;

import java.util.*;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    private userService userService;

    // public ResponseEntity<getuser> getuser(user user)
    // {
    // return ResponseEntity<getuser>(userService.getuser(),HttpStatus.CREATED);
    // }

    @PostMapping("/api")
    public ResponseEntity<user> saveuser(@RequestBody user user) {
        System.out.println(user);
        return new ResponseEntity<user>(userService.saveuser(user), HttpStatus.CREATED);
    }

    // public String

    @GetMapping("/api")
    public List<user> getalluser() {
        return userService.getalluser();
    }

    @GetMapping("/api/{id}")
    public ResponseEntity<user> getUserById(@PathVariable("id") int Userid) {
        return new ResponseEntity<user>(userService.getUserByUserId(Userid), HttpStatus.CREATED);
    }

    @PutMapping("/api/{id}")
    public ResponseEntity<user> updatUser(@PathVariable("id") int id, @RequestBody user user) {
        System.out.println("put kar raha hu" + user);
        return new ResponseEntity<user>(userService.updatUser(user, id), HttpStatus.CREATED);
    }

    @DeleteMapping("/api/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
        return new ResponseEntity<String>("User Deletd Successfully", HttpStatus.CREATED);
    }

}
