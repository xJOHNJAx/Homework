package Football;

public class Main {
        public static void main(String[] args) {
            ChampionshipTable table = new ChampionshipTable();
            table.addMatchResult(Team.Juventus, 0, 10);
            table.addMatchResult(Team.Fiorentina, 3, 5);
            table.addMatchResult(Team.Milan, 5, 3);
            table.addMatchResult(Team.Monza, 10, 0);
            table.addMatchResult(Team.Inter, 0, 6);
            table.addMatchResult(Team.Lecce, 6, 0);
            table.addMatchResult(Team.Bologna, 3, 3);
            table.addMatchResult(Team.Atalanta, 3, 3);
            table.displayTableByPoints();
        }
    }

