/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDistinctFlow {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sergio","Sunil","Ana","Michelle",
				"Sunil","Sergio","Anita");
		
		List<String> result = 
				
			names.stream()
				 .peek(e->System.out.println("Filter: " + e))
				 .filter(name -> name.length() >3)
				 .peek(e->System.out.println("  Distinct: " + e))
				 .distinct()
				 .peek(e->System.out.println("     Sort Start: " + e))
				 .sorted()
				 .peek(e->System.out.println("     Sort Done: " + e))
				// .peek(e->System.out.println("Going to take distinct elements: " + e))
				// .distinct()
				// .peek(e -> System.out.println("Done with distinct"))
				 .peek(e->System.out.println("Map: " + e))
				 .map(name -> name.toUpperCase())				 			
				 .peek(e->System.out.println("Collect: " + e))
				 .collect(Collectors.toList());
		
		System.out.println("Result is "+result);
		System.out.println("Original list is "+names);
	}

}
