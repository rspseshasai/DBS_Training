package com.demo.spring;

import java.util.List;

import javax.validation.constraints.Email;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.demo.spring.entity.Customer;
import com.demo.spring.entity.Temp;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	

	@Query("SELECT count(u) FROM Customer u WHERE u.mail=?1")
	int countUsersWithEmail(String email);
}
