package OOP_Recap;

import java.util.Random;

public class Octopus extends Animal implements Movement {

    Random random = new Random();

    public void makeDoActivity() {
        while (true) {
            String activity = selectActivity();
            System.out.println(activity);
            if (activity.equals("Mate")) {
                System.out.println("Otto is a horny beast");
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Random random = new random;
    private String selectActivity() {
        String activity;

        int activityNumber = random.nextInt(10) + 1;
        switch (activityNumber) {
            case 1:
                return "Flapping";
            case 2:
                return "Mate";
            case 3:
                return "Swashing";
            case 4:
                return "Swimming";
            case 5:
                return "whooping";
            case 6:
                return "Swooping";
            default:
                return "I sleep";
        }
    }

    @Override
    public String move() {
        return "Swish Swosh";
    }
}
