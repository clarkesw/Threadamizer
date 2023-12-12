/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer.employee;

import java.util.Comparator;

/**
 *
 * @author Clarke S.
 */
public class EmployeeSorterUsual {
    public static final Comparator<Employee> byNameAlphabetical = Comparator.comparing((Employee e) -> e.getName());
            
            
//            new Comparator<Employee>() {
//
//		@Override
//		public int compare(Employee e1, Employee e2) {
//			return e1.getName().compareTo(e2.getName());
//		}
//		
//	};
    
    public static final Comparator<Employee> byExp = Comparator.comparingInt(Employee::getExperience);
	
    public static final Comparator<Employee> byInrExpAndName = Comparator.comparing((Employee e) -> e.getExperience()).thenComparing(byNameAlphabetical);
    
    
//	public static final Comparator<Employee> byInrExpAndName = new Comparator<Employee>() {
//            
//		@Override
//		public int compare(Employee e1, Employee e2) {
//			if(e1.getExperience() == e2.getExperience()) {
//				return e1.getName().compareTo(e2.getName());
//			}
//                        Integer ee1 = e1.getExperience();
//                        Integer ee2 = e2.getExperience();
//                        return ee1.compareTo(ee2);
//		//	return (e1.getExperience() < e2.getExperience()) ? -1 : 1;
//		}
//        };
	
   //     public static final Comparator<Employee> byInrExpAndName = (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName());
        public static final Comparator<Employee> byDecExpAndName = Comparator.comparing((Employee e) -> e.getName());
        
//	public static final Comparator<Employee> byDecExpAndName = new Comparator<Employee>() {
//
//		@Override
//		public int compare(Employee e1, Employee e2) {
//			if(e1.getExperience() == e2.getExperience()) {
//				return e1.getName().compareTo(e2.getName());
//			}
//			return (e1.getExperience() < e2.getExperience()) ? 1 : -1;
//		}
//		
//	};
}
