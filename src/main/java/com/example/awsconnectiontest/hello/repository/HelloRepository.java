package com.example.awsconnectiontest.hello.repository;

import com.example.awsconnectiontest.hello.entity.Hello;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloRepository extends JpaRepository<Hello, Long> {

}
