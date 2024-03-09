package com.telusko.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.telusko.bo.Customer;

public interface ICustomerRepo extends MongoRepository<Customer, String> 
{
	public List<Customer> findByBillAmtBetween(Float min,Float max);
}
