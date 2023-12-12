/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer.customer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctCustomer {
	
	public static void main(String[] args) 
	{		
		Customer c1 = new Customer(1,"Anil");
		Customer c2 = new Customer(2,"Bob");
		Customer c3 = new Customer(3,"Christie");
		Customer c4 = new Customer(4,"Danny");
		Customer c5 = new Customer(1,"Anil");
		Customer c6 = new Customer(1,"Anil");
		Customer c7 = new Customer(5,"Heather");
		
		List<Customer> customers = Arrays.asList(c1,c2,c3,c4,c5,c6,c7);
		List<String> uniqueCustomerNames =
						customers.stream()
								 .filter(customer ->customer.getName().length() > 3)
								 .distinct()
								 .map(customer -> customer.getName())
								 .collect(Collectors.toList());
		
		System.out.println(uniqueCustomerNames);
	}

}
