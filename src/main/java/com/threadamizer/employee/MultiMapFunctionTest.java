/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Example - MultiMap
//Input - ["bengaluru,paris,barcelona,madrid"]

//Output- {b=["bengaluru","barcelona"], m =["madrid"] , p =["paris"]}

public class MultiMapFunctionTest {

	public static void main(String[] args) {
            List<String> strings = Arrays.asList("i", "z", "we", "am", "learning", "lambdas");
//------------- sorting alphbetically            
//            Collections.sort(strings, new Comparator<String>(){
//                        @Override
//                        public int compare(String s1, String s2){
//                            return s1.compareTo(s2);                                                                                  
//                        }
//                    });            

//           Collections.sort(strings, (String s1, String s2) -> s1.compareTo(s2));

//------------- sorting by string length
//            Collections.sort(strings, new Comparator<String>(){
//                 @Override
//                 public int compare(String s1, String s2){
//                        if(s1.length() > s2.length()){
//                            return 1;
//                        }else if(s1.length() < s2.length()){
//                            return -1;
//                        }
//                        return 0;
//                    }
//            });

//            Collections.sort(strings, new Comparator<String>(){
//                 @Override
//                 public int compare(String s1, String s2){
//                        return Integer.compare(s1.length(), s2.length());
//                    }
//            });
            
//          Collections.sort(strings, (String s1, String s2) -> Integer.compare(s1.length(), s2.length()));

            Comparator<String> byLen = Comparator.comparing(s -> s.length());
            strings.sort(byLen);
           
            for(String out : strings){
                System.out.println(out);
            }
            
//		List<String> cities = getCities();
//		beforeLambdas(cities);
//		afterLambdas(cities);
	}

	private static void beforeLambdas(List<String> cities) {
		
		//Input - ["bengaluru,paris,barcelona,madrid"]
		// {, [] }
		// {, [] }
		// {, [] }
		Map<Character, List<String>> cityMap = new HashMap<>();
                
                for (String city : cities){
                    cityMap.computeIfAbsent(city.charAt(0), k -> new ArrayList<String>()).add(city);
                } 
                    
                    
//		for (String city : cities) {
//			List<String> cityList = cityMap.get(city.charAt(0));
//			if (cityList == null) {
//				cityList = new ArrayList<>();
//				cityMap.put(city.charAt(0), cityList); 
//			}
//			cityList.add(city);
//		}
		System.out.println("Before Lambdas : ");
		System.out.println(cityMap);
	}

	private static void afterLambdas(List<String> cities) {
		
		//Input - ["bengaluru,paris,barcelona,madrid"]
		
		Map<Character, List<String>> cityMap = new HashMap<>();

		for (String city : cities) {
			// {, [] }
			// {, [] }
			// {, [] }
			// {, [] }
			cityMap.computeIfAbsent(city.charAt(0), k -> new ArrayList<>()).add(city);
		}
		System.out.println("Using lambdas: ");
		System.out.println(cityMap);
	}

	private static List<String> getCities() {
		return Arrays.asList("bengaluru", "paris", "madrid", "barcelona");
	}

}
