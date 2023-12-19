/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer.dictionary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class DictionaryFindFirstAny {
	
    //change as per location.
    private static String FILE_PATH = "C:\\Users\\clark\\OneDrive\\Documents\\NetBeansProjects\\Threadamizer\\src\\main\\java\\com\\threadamizer\\dictionary\\dictionary.txt";

    public static void main(String[] args) throws IOException {


            //Find the first occurrence of a large word. i.e  > 20 characters.
            findFirstLargeWord();

            //Find a word that starts with 'a' and greater than 10 characters.
       //     String firstLetter = "a"; 
       //     findWordStartingFrom(firstLetter);					   
    }

//    private static void findWordStartingFrom(String firstLetter) throws IOException{
//        try(Stream<String> lines = Files.lines(Paths.get(FILE_PATH))){
//                  Optional<String> firstLargeWord = lines
//                             //       .filter(word -> word.length() > 6 && word.startsWith(firstLetter, 0))
//                            //        .limit(2)
//                                    .allMatch(str -> str.length() > 2 );
//
//                System.out.println(firstLargeWord.orElse("No large word found..."));          
//        }
//    }
    
    public static void findFirstLargeWord() throws IOException{

        try(Stream<String> lines = Files.lines(Paths.get(FILE_PATH))){			

            long count = lines.count();
            System.out.println(count);
            
//            long sum = lines.mapToInt(String::length).sum();
//            System.out.println(sum);
        }
    }
    
    public static void sumWords() throws IOException{

        try(Stream<String> lines = Files.lines(Paths.get(FILE_PATH))){			
                Optional<String> firstLargeWord = lines.filter(line -> line.startsWith("a"))
                        .max(Comparator. 
                       comparing(String::length));

                System.out.println(firstLargeWord.orElse("No large word found..."));
        }
    }

//    public static void findWordStartingFrom(String firstLetter) throws IOException {
//
//        try(Stream<String> lines = Files.lines(Paths.get(FILE_PATH))){
//                Optional<String> anyLargeWord = lines.filter(word -> word.startsWith(firstLetter))
//                                                                        .filter(word -> word.length() > 10)
//                                                                        .findAny();
//
//                System.out.println(anyLargeWord.orElse("No word starting "
//                                + "from "+firstLetter+"found..."));
//        }		
//    }


}
