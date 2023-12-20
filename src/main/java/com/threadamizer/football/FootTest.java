/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer.football;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Clarke S.
 */
public class FootTest {
    public static void main(String[] args) {
        List<FootballTeam> footBallTeamData = FootballTeamTestData.getFootBallTeamData();
        Map<League, Map<FootballTeamType,List<FootballTeam>>> totalPointsLeague = footBallTeamData.stream()
                        .collect(Collectors.groupingBy(FootballTeam::getLeague,Collectors.groupingBy(team -> areAttackingString(team))));
        
        System.out.println(totalPointsLeague);
    }
    
    public static boolean inChampions(FootballTeam ft){
        return ft.getLeague() == League.CHAMPIONS_LEAGUE;
    }
    
     public static boolean areAttacking(FootballTeam ft){
        return ft.getPoints() >= 18;
    }
     
    public static FootballTeamType areAttackingString(FootballTeam ft){
        return ft.getGoalsFor() >= 18 ? FootballTeamType.ATTACKING : FootballTeamType.DEFENSIVE;
    }
}

//        Map<League,Integer> totalPointsLeague = footBallTeamData.stream()
//                        .collect(Collectors.groupingBy(FootballTeam::getLeague,
//                                                        Collectors.summingInt(FootballTeam::getPoints)));

//        Map<Boolean,List<FootballTeam>> totalPointsLeague = footBallTeamData.stream()
//                        .collect(Collectors.partitioningBy(team -> inChampions(team)));

//        Map<Boolean,List<FootballTeam>> totalPointsLeague = footBallTeamData.stream()
//                        .collect(Collectors.partitioningBy(team -> areAttacking(team)));

//        Map<FootballTeamType,List<FootballTeam>> totalPointsLeague = footBallTeamData.stream()
//                        .collect(Collectors.groupingBy(team -> areAttackingString(team)));