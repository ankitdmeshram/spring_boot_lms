package com.example.learning;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FetchOrderService extends JpaRepository<OrderModel, Integer> {

	@Override
	public List<OrderModel> findAll();
	
}
