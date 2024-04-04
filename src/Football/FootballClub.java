package Football;

public class FootballClub {
        private final Team team;
        private int matchesPlayed;
        private int goalsScored;
        private int goalsConceded;
        private int points;

    public FootballClub(Team team) {
        this.team = team;
    }

        public Team getTeam() {
                return team;
        }

        public int getMatchesPlayed() {
                return matchesPlayed;
        }


        public int getGoalsScored() {
                return goalsScored;
        }


        public int getGoalsConceded() {
                return goalsConceded;
        }


        public int getPoints() {
                return points;
        }

        public void setMatchesPlayed(int matchesPlayed) {
                this.matchesPlayed = matchesPlayed;
        }

        public void setGoalsScored(int goalsScored) {
                this.goalsScored = goalsScored;
        }

        public void setGoalsConceded(int goalsConceded) {
                this.goalsConceded = goalsConceded;
        }

        public void setPoints(int points) {
                this.points = points;
        }
}
