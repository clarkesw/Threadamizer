/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer.movie;

import java.util.*;
import java.util.function.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.*;

//Solution to the exercise Movies_stream_filter_collect
public class MovieTest {
	
	public static List<Movie> movies = MovieUtil.getMovieData();
	
	public static void main(String[] args) {
	
		//movies in 2020
		int year = 2015;
                Genre genre = Genre.ACTION;
		Predicate<Movie> movieReleasedInYear2020 = x -> x.getDateOfRelease().getYear() >= year;//movieReleasedInYear(year);
                Predicate<Movie> movieByType = movie -> movie.getGenre() == genre;//movieReleasedInYear(year);
                Predicate<Movie> movieByFranchise = movie -> movie.getName().contains("Rocky");
                Predicate<Movie> mostMoney = movie -> movie.getName().contains("Rocky");
                
                
//                Optional<String> inS1 = getMatches("stuff");
//                Optional<String> inS2 = getMatches("thing");
//
//		System.out.println(inS1.orElse("Not Found"));
//                System.out.println(inS2.orElse("Not Found"));
//		//exercise one- 
//		List<Movie> getMoviesInYear = getFiteredMovies(movieReleasedInYear2020);
//		System.out.println("\nMovies released in Year "+year + ": " + getMoviesInYear);
		
		//exercise two - retrieve the names of movies that belong to the Action genre 
//		List<String> movies  = getActionMovieNames(movieByType);
//		System.out.println("\nNames of Action Movies: "+movies);
		
		//exercise three - action movie names sorted alphabetically.
//		List<String> actionMoviesSortedByName  = getActionMovieNamesSorted(movieByType);
//		System.out.println("\nNames of Action movies sorted: "+actionMoviesSortedByName);
//		
		//exercise four - retrieve action movies sorted by release date.
//		List<Movie> actionMoviesByReleaseDate  = getActionMovieSortedByReleaseDate(movieByType);
//		System.out.println("\nAction movies sorted by release date: " + actionMoviesByReleaseDate);
//		
//		Movie actionMoviesByFran  = getMovieFran(movieByFranchise);
//		System.out.println("\nAction movies sorted by release date: " + actionMoviesByFran);
                
//		 getMovieWill();

//		//exercise five - Get unique names of the directors that have a movie released after 2000.
//		List<String > directors = getDirectorNamesOfMoviesAfter2000();
//		System.out.println("\nNames of directors that have released movies "
//				+ "after year 2000: " +directors);

		movie5Years(movieReleasedInYear2020);		
	}
        
    private static void movie5Years(Predicate<Movie> movieReleasedInYear2020) {
           long getMoviesInYear = movies.stream()
                    .filter(movieReleasedInYear2020)                    
                    .count();    
           
        System.out.println("\nMovies released in Year: " + getMoviesInYear);
    }
             
       private static void martinMovie() {
            long max = movies.stream()
                                    .filter(movie -> movie.getDirectorName().contains("Martin Scorsese"))
                                    .mapToLong(Movie::getGrossEarning)
                                    .sum();    
           
           System.out.println("\nMovies released in Year: " + max);
     }
        
     private static void highestMovie() {
            Optional<Movie> max = movies.stream()
                    .min(Comparator.comparing(Movie::getGrossEarning));    
           
           System.out.println("\nMovies released in Year: " + max);
     }
     
     private static void get2000sMovies(Predicate<Movie> movieReleasedInYear2020) {
           List<String> getMoviesInYear = movies.stream()
                    .filter(movieReleasedInYear2020)                    
                    .distinct()
                    .map(Movie::getDirectorName)
                    .collect(Collectors.toList());    
           
        System.out.println("\nMovies released in Year: " + getMoviesInYear);
    }
     
    private static void getMovieWill() {
    
        Predicate<Movie> movieBy2020 = movie -> movie.getDateOfRelease().getYear() == 2020;
        Predicate<Movie> movieByWill = movie -> movie.getCast().contains("Will Smith");
        
            Optional<Movie> willysMovie = movies.stream()
                    .filter(movieBy2020)                    
                    .filter(movieByWill)
                //    .map(movie -> movie.getName())
                    .findAny();    
        System.out.println("\nAction willysMovie: " + willysMovie.get().getName());
    }
        
    private static Movie getMovieFran(Predicate<Movie> movieByFranchise) {
        Comparator<Movie> myComp = Comparator.comparing(movie -> movie.getDateOfRelease());
            Optional<Movie> findFirst = movies.stream()
                    .filter(movieByFranchise)
                    .sorted(myComp)
                    .findFirst();
            return findFirst.get();
    }
        
    private static List<Movie> getActionMovieSortedByReleaseDate(Predicate<Movie> movieByType) {
        Comparator<Movie> myComp = Comparator.comparing(movie -> movie.getDateOfRelease());
        return movies.stream().filter(movieByType)
                              .sorted(myComp)
                              .collect(Collectors.toList());
    }        

        public static Optional<String> getMatches(String patt){
            String check = "I am not sure of things";
            Pattern pattern = Pattern.compile(patt, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(check);
            return matcher.find() ? Optional.of(patt) : Optional.empty();
        }
	//exercise 1 - re-factor this method to use stream/filter/collect
	public static List<Movie> getFiteredMovies(Predicate<Movie> movieFilter) {
		List<Movie> filteredMovies = new ArrayList<>();
                
                filteredMovies = movies.stream()
                        .filter(movieFilter)
                        .collect(Collectors.toList());
//		for(Movie m: movies) {
//			if(movieFilter.test(m)){
//				filteredMovies.add(m);
//			}
//		}
		return filteredMovies;
	}
	
        public static List<String> getActionMovieNames(Predicate<Movie> movieByType){
            List<String> filteredMovies = movies.stream()
                    .filter(movie -> movie.getGenre() == Genre.ACTION)
                    .map(movie -> movie.getName())
                    .collect(Collectors.toList());
            return filteredMovies;
        }            

    private static List<String> getActionMovieNamesSorted(Predicate<Movie> movieByType) {
        Comparator<Movie> byRelDate = Comparator.comparing(x -> x.getDateOfRelease());
        List<String> filteredMovies = movies.stream()
                        .sorted(byRelDate.reversed())
                        .filter(movieByType)
                        .map(movie -> movie.getName())
                        .collect(Collectors.toList());
        return filteredMovies;
    }


}
