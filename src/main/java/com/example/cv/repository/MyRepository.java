package com.example.cv.repository;

import org.springframework.data.repository.CrudRepository;

public interface MyRepository<MyEntity> extends CrudRepository<MyEntity, Long> {
    // Custom repository methods can be defined here (if needed)
}
