package com.ecommerce.restapi.ecommercerestapi.userService;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ecommerce.restapi.ecommercerestapi.Entites.user;

@Component
public interface userService {
    user saveuser(user user);

    List<user> getalluser();

    user getUserByUserId(int id);

    user updatUser(user user, int id);

    void deleteUser(int id);
}
