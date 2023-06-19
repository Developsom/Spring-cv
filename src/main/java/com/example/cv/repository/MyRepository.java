package com.example.cv.repository;

import com.example.cv.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepository extends CrudRepository<User, Long> {
    // Custom repository methods can be defined here (if needed)
}
