package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.dto.CustomerDto;
import com.telusko.generator.IdGenerator;
import com.telusko.service.CustomerServiceImpl;

@SpringBootApplication
public class SpringBootMongoDbApplication 
{

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootMongoDbApplication.class, args);
		
		CustomerServiceImpl service=context.getBean(CustomerServiceImpl.class);
		
//		System.out.println(service.registerCustomer(new CustomerDto(101,"NS","Kol")));
//		System.out.println(service.registerCustomer(new CustomerDto(102,"ST","chennai")));
//		System.out.println(service.registerCustomer(new CustomerDto(103,"unknown","Mumbai")));
		CustomerDto dto=new CustomerDto();
		dto.setId(IdGenerator.generateId());
		dto.setCusNo(108);
		dto.setName("me2");
		dto.setCity("unknown2");
		dto.setBillAmt(147.5f);
//		System.out.println(service.registerCustomer(dto));
//	
//		
//		service.findAllCustomers().forEach(cus->System.out.println(cus));
		
		service.fetchByBillAmtBetween(100f, 500f).forEach(c->System.out.println(c));
//		String id="65ae9fb6be8be20ffb4d65a";
//		System.out.println(service.removeDocument(id));
	
	}

}
