/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer;

import java.util.*;
import java.util.stream.*;

/**
 *
 * @author Clarke S.
 */
public class Basic {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("me","twagon","mike","kasandri","Clarke");
        List<String> collect = names.stream()
                .filter(x -> x.length() > 4)
                .sorted()
                .collect(Collectors.toList());

//        Comparator<String> comp = new Comparator<String>(){
//            @Override
//            public int compare(String a, String b){
//                if(a.compareTo(b)){
//                    return -1;
//                }else if(b.compareTo(a)){
//                    return 1;
//                }
//                return 0;
//            }
//        };
//                       .filter(Basic::isMore)
//                .map(Basic::toUpper)
        for(String out : collect){
            System.out.println(out);
        }
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
