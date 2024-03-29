package com.telusko.service;

import java.util.List;

import com.telusko.bo.Customer;
import com.telusko.dto.CustomerDto;

public interface ICustomerService 
{
	public String registerCustomer(CustomerDto dto);
	public List<Customer> findAllCustomers();
	public String removeDocument(String id);
	public List<Customer> fetchByBillAmtBetween(Float min,Float max);

}
