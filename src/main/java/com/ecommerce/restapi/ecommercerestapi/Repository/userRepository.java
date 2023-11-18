package com.ecommerce.restapi.ecommercerestapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ecommerce.restapi.ecommercerestapi.Entites.user;

@Component
public interface userRepository extends JpaRepository<user, Integer> {

}
