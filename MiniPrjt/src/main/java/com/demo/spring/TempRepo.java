package com.demo.spring;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.spring.entity.Temp;

public interface TempRepo extends JpaRepository<Temp, Integer> {

}
