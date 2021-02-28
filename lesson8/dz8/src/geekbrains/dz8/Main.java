package geekbrains.dz8;


public class Main {
    private final static int barriersCount = 4;
    private final static int participantCount = 3;

    public static void main(String[] args) {


        Barrier[] barriers = new Barrier[barriersCount];
        Action[] participant = new Action[participantCount];

        participant[0] = new Human("Human", 100, 2);
        participant[1] = new Robot("Robo", 10, 1);
        participant[2] = new Cat("Cat", 20, 3);


        barriers[0] = new RunningTrack("RunningTrack", 10);
        barriers[1] = new RunningTrack("RunningTrack", 100);
        barriers[2] = new Wall("Wall", 2);
        barriers[3] = new Wall("Wall", 3);

        ObstacleTest test = new ObstacleTest();

        for (int i = 0; i < participant.length; i++) {
            for (int j = 0; j < barriers.length; j++) {
                if (!test.test(participant[i], barriers[j])) {
                    break;
                }
                System.out.println(test.test(participant[i], barriers[j]));
            }

        }


    }
}
