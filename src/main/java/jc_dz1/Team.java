package jc_dz1;

public class Team {
        public String name;
        public Player players[];


        public Team(String name, Player... newPlayers) {
            this.name = name;
            this.players = newPlayers;
        }

        public void showResults() {
            for (Player player : players) {
                Course.doRun(player);
                Course.doSwim(player);
            }
        }

        public void doRun(Course course) {
            for (Player player : players) {
                course.doRun(player);
            }
        }
        public void doSwim(Course course) {
            for (Player player : players) {
            course.doSwim(player);
        }
    }
}

