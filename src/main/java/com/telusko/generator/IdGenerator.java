package com.telusko.generator;

import java.util.UUID;

public class IdGenerator 
{
	public static String generateId()
	{
		System.out.println("Custom Id generator is called ");
		return UUID.randomUUID().toString().replace("-","").substring(0,10);
	}
}
