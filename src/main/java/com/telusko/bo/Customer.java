package com.telusko.bo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
public class Customer 
{
	@Id
	private String id;
	private Integer cusNo;
	private String name;
	private String city;
	private Float billAmt;
	
	public Customer() 
	{
		System.out.println("Zero pram customer obj");
	}

	public Customer(String id, Integer cusNo, String name,String city,Float billAmt) 
	{
		super();
		this.id = id;
		this.cusNo = cusNo;
		this.name = name;
		this.city=city;
		this.billAmt=billAmt;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getCusNo() {
		return cusNo;
	}

	public void setCusNo(Integer cusNo) {
		this.cusNo = cusNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getBillAmt() {
		return billAmt;
	}

	public void setBillAmt(Float billAmt) {
		this.billAmt = billAmt;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", cusNo=" + cusNo + ", name=" + name + ", city=" + city + ", billAmt=" + billAmt
				+ "]";
	}

}
