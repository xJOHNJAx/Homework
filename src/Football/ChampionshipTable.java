package Football;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ChampionshipTable {
    private List<FootballClub> clubs;

    public ChampionshipTable() {
        clubs = new ArrayList<>();
        for (Team team : Team.values()) {
            clubs.add(new FootballClub(team));
        }
    }

    public void displayTableByPoints() {
        clubs.sort(Comparator.comparing(FootballClub::getPoints).reversed());
        for (FootballClub club : clubs) {
            System.out.println(club.getTeam() + " Points: " + club.getPoints());
        }
    }

    public void addMatchResult(Team team, int goalsScored, int goalsConceded) {
        for (FootballClub club : clubs) {
            if (club.getTeam() == team) {
                club.setMatchesPlayed(club.getMatchesPlayed() + 1);
                club.setGoalsScored(club.getGoalsScored() + goalsScored);
                club.setGoalsConceded(club.getGoalsConceded() + goalsConceded);

                if (goalsScored > goalsConceded) {
                    club.setPoints(club.getPoints() + 3);
                }
                if (goalsScored < goalsConceded) {
                    club.setPoints(club.getPoints());
                }
                if (goalsScored == goalsConceded) {
                    club.setPoints(club.getPoints() + 1);
                }
                break;
            }
        }
    }
}