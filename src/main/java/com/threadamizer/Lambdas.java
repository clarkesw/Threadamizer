/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *lambda expression to check if a list of strings contains a specific word.
 * @author Clarke S.
 */
public class Lambdas {
    public static void main(String argvs[]){
        List<String> stList = Arrays.asList("go","team","balk");
        String check = "team";
        
        Predicate<String> pal = s -> s.equals(check);
        boolean anyMatch = stList.stream()
                .anyMatch(pal);
        
        System.out.println("My Team:" + anyMatch);
    }
}
