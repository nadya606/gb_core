package jc_dz1;

public class HomeWork1 {
        public static void main(String[] args) {

            Course c = new Course(new Course[] {
                    new Track(8),
                    new Pool(7)
            });
            Team team = new Team(
                    "Dream team",
                    new Cat("tom", 10, 6),
                    new Dog("buddy", 20, 15),
                    new Cat("morze", 7, 9),


            c.doRun(team);
            c.doSwim(team);
            team.showResults();
        }
    }

