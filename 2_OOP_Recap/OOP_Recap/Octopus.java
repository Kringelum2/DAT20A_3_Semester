package OOP_Recap;

public class Octopus extends Animal implements Movement {

    // Random random = new random;
    public String activity(int activityNumber) {
        switch (activityNumber) {
            case 1:
                return "Flapping";
            case 2:
                return "Nopping";
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
