package com.ecommerce.restapi.ecommercerestapi.userService.userServiceImp;

// import java.lang.*;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.restapi.ecommercerestapi.Entites.user;
import com.ecommerce.restapi.ecommercerestapi.Repository.userRepository;
import com.ecommerce.restapi.ecommercerestapi.UserRespondException.UserResourceNotFoundException;
import com.ecommerce.restapi.ecommercerestapi.userService.userService;
// import com.google.common.base.Optional;

@Service
public class userServiceimp implements userService {

    @Autowired
    private userRepository userRepository;

    @Override
    public List<user> getalluser() {
        return userRepository.findAll();
    }

    @Override
    public user saveuser(user user) {
        // System.out.println("...." + user);
        return userRepository.save(user);
    }

    @Override
    public user getUserByUserId(int id) {
        Optional<user> user = userRepository.findById(id);

        if (user.isPresent()) {
            return user.get();
        } else {
            throw new RuntimeException();
        }

    }

    @Override
    public user updatUser(user user, int id) {

        // Optional<user> exitinguser = userRepository.findById(id);

        // if (exitinguser.isPresent()) {
        // exitinguser.setName(user.getName());
        // exitinguser.setLastName(user.getLastName());

        // userRepository.save(exitinguser);
        // return exitinguser;
        // } else {
        // throw new RuntimeException();
        // }

        user exitingUser = userRepository.findById(id)
                .orElseThrow(() -> new UserResourceNotFoundException("user", "id", "name", "lastName"));
        exitingUser.setId(user.getId());
        exitingUser.setName(user.getName());
        exitingUser.setLastName(user.getLastName());
        userRepository.save(exitingUser);
        return user;
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

}
