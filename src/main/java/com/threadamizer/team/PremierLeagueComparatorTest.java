/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer.team;

import java.util.*;

/**
 *
 * @author Clarke S.
 */
public class PremierLeagueComparatorTest {
 
    public static void main(String[] args) {
       // Rank by 
       //  1. points
       //  2. goalDifference
       //  3. goalsScored
        //Using the usual way of sorting.
//        System.out.println("Old style: ");
//        sortByTeamStandingsUsualWay();

        //Using static method on Comparator
        System.out.println("New style ");
        sortByTeamStandingsByComparing();
    }
    
    private static void sortByTeamStandingsUsualWay() {
        List<PremierLeagueTeam> standings = getTeamStats();
//        Comparator<PremierLeagueTeam> byPoints =  new Comparator<PremierLeagueTeam>(){
//            @Override
//            public int compare(PremierLeagueTeam s1, PremierLeagueTeam s2){
//                if(s1.getPoints() > s2.getPoints()){
//                    return 1;
//                }else if(s1.getPoints() < s2.getPoints()){
//                    return -1;
//                }
//                return 0;
//            }
//        };
        
//        Comparator<PremierLeagueTeam> byPoints =  (PremierLeagueTeam s1, PremierLeagueTeam s2) -> {
//                if(s1.getPoints() > s2.getPoints()){
//                    return 1;
//                }else if(s1.getPoints() < s2.getPoints()){
//                    return -1;
//                }
//                return 0;
//            };
 //       Collections.sort(standings,byPoints);
 
        Comparator<PremierLeagueTeam> byPoints =  (PremierLeagueTeam s1, PremierLeagueTeam s2) -> 
                    Integer.compare(s2.getPoints(), s1.getPoints());
        
        Comparator<PremierLeagueTeam> byGoalDiff =  (PremierLeagueTeam s1, PremierLeagueTeam s2) -> 
                    Integer.compare(s2.getGoalDifference(), s1.getGoalDifference());
        
        Comparator<PremierLeagueTeam> byGoals =  (PremierLeagueTeam s1, PremierLeagueTeam s2) -> 
                    Integer.compare(s2.getGoalsScored(), s1.getGoalsScored());        
        
        Comparator<PremierLeagueTeam> byAll = byPoints.thenComparing(byGoalDiff).thenComparing(byGoals);
        
        standings.sort(byAll);
        for(PremierLeagueTeam team : standings){
            System.out.println(team.getName());
        }      
    }
    
	public static void sortByTeamStandingsByComparing() {
		List<PremierLeagueTeam> standings = getTeamStats();
		
		Comparator<PremierLeagueTeam> byPoints = Comparator.comparingInt(PremierLeagueTeam::getPoints)
				                                           .reversed(); 
		
		Comparator<PremierLeagueTeam> byGoalDiff = Comparator.comparingInt(PremierLeagueTeam::getGoalDifference)
				                                             .reversed();
		
		Comparator<PremierLeagueTeam> byGoalScored = Comparator.comparingInt(PremierLeagueTeam::getGoalsScored)
				                                               .reversed();
		
		Comparator<PremierLeagueTeam> BY_STANDINGS = byPoints.thenComparing(byGoalDiff)
				                                             .thenComparing(byGoalScored);
		
		
		standings.sort(BY_STANDINGS);
		
		for(PremierLeagueTeam team : standings) {
			System.out.println(team);	
		}
	}
    
    private static List<PremierLeagueTeam> getTeamStats() {

            List<PremierLeagueTeam> plTeams = new ArrayList<>();

            plTeams.add(new PremierLeagueTeam("Man City", 66, 71, 41));
            plTeams.add(new PremierLeagueTeam("Leicester City", 81, 68, 36));
            plTeams.add(new PremierLeagueTeam("Arsenal", 71, 65, 36));
             plTeams.add(new PremierLeagueTeam("Man United", 66, 49, 35));
            plTeams.add(new PremierLeagueTeam("Tottenham", 70, 69, 35));
            
           

            return plTeams;
    }
}
