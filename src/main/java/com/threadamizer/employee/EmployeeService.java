/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeService {	
	
	public List<Employee> getEmployeesFilteredBy(Predicate<Employee> filter) {

		List<Employee> employees = EmployeeUtil.initialize();
		
		List<Employee> filteredEmployee = new ArrayList<>();
		for (Employee employee : employees) {
			if (filter.test(employee)) {
				filteredEmployee.add(employee);
			}
		}
		return filteredEmployee;
	}
	
	
	//retrieve a list of employees that are sorted alphabetically by name
	public List<Employee> sortByName(){
		List<Employee> employees = EmployeeUtil.initialize();
		employees.sort(EmployeeSorterUsual.byExp);
		return employees;
	}
	
	/**Sort the employees with increasing experience and if they have the same experience, 
	then we sort them alphabetically by name.*/
	
	public List<Employee> sortByInreasingExpAndThenName(){
		List<Employee> employees = EmployeeUtil.initialize();
		employees.sort(EmployeeSorterUsual.byInrExpAndName);
		return employees;
	}
	
	/**
	 * Sort  the employees with decreasing experience 
	 * and if they have the same experience, then we sort them alphabetically by name.
	 */
	public List<Employee> sortByDecreasingExpAndThenName(){
		List<Employee> employees = EmployeeUtil.initialize();
		employees.sort(EmployeeSorterUsual.byDecExpAndName);
		return employees;
	}
	
	/**
	 * Exercise
	 * Top 3 methods can be combined into one.
	 * @param sorter - Pass behavior
	 * @return -Sorted list.
	 */
	public List<Employee> getEmployees(Comparator<Employee> sorter){
		List<Employee> employees = EmployeeUtil.initialize();
		Collections.sort(employees,sorter);
		return employees;
	}
        
        public List<Employee> getMultiSkilledEmplyee(){
            List<Employee> employees = EmployeeUtil.initialize();
//            List<Employee> multiSkill = new ArrayList<>();
//            
//            for(Employee emp : employees){
//                if(emp.getSkills().size() > 1)
//                    multiSkill.add(emp);
//            }
            
            List<Employee> multiSkill = employees.stream()
                                    .filter(x -> x.getSkills().size() > 1)
                                    .collect(Collectors.toList());
            
            
            
            Collections.sort(multiSkill, EmployeeSorterUsual.byExp);
            
            List<String> names = multiSkill.stream()
                                    .map(emp -> emp.getName())
                                    .collect(Collectors.toList());
            return multiSkill;
        }

}
