/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/**
 *
 * @author Clarke S.
 */
public class Basic {
    private static String FILE_PATH = "C:\\Users\\clark\\OneDrive\\Documents\\NetBeansProjects\\Threadamizer\\src\\main\\java\\com\\threadamizer\\sample.txt";
    public static void main(String[] args) throws IOException {
//        List<String> names = Arrays.asList("me","twagon","mike","kasandri","Clarke");
//        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20); 

//        List<String> articles = Arrays.asList("a","an","the");
//        List<String> list = Arrays.asList("software","programmer","i","am","a","java","the");
         Predicate<String> pred1 = line -> line.startsWith("#");
        Predicate<String> pred2 = line -> line.endsWith("#");
        
        boolean isPassValid = false;
        String myPass = "asdf";

        try(Stream<String> lines = Files.lines(Paths.get(FILE_PATH))){
            isPassValid = lines.allMatch(Basic::isLineProperlyDelimited);
        }
        
        System.out.println(isPassValid); 
    }
    
    private static boolean isLineProperlyDelimited(String line) {
            return line.startsWith("#")&& line.endsWith("#");
    }
    
    public static boolean isMore(String inS){
        System.out.println("More than 5 : "+ inS);
        return inS.length() > 5;
    }
    
    public static String toUpper(String inS){
        System.out.println("Upper : "+ inS);
        return inS.toUpperCase();
    }
}
