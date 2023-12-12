/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer.employee;

import java.util.*;


/**
 *
 * @author Clarke S.
 */
public class Sorting {
    public static void main(String args[]){   
        
        List<Employee> employees = EmployeeUtil.initialize();
        

        Comparator<Employee> nameComp = new Comparator<Employee>(){
            
            @Override
            public int compare(Employee o1, Employee o2) {

                    return o2.getName().compareTo(o1.getName());
            }
        };
        
        Collections.sort(employees, nameComp);
  
        employees.forEach(System.out::println);
   }   
}


