package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepo extends JpaRepository<Customers, Integer>{
	
	List<Customers> findByCustname(String name);
	List<Customers> findByCustidGreaterThan(int id);
	
	

}
