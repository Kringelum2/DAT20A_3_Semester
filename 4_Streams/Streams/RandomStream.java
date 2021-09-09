package Streams;

import java.util.Random;

public class RandomStream {

    public static void main(String[] args) {
        Random random = new Random();
        // System.out.println(random.nextInt()); // not a stream
        random.ints().limit(4).forEach(number -> System.out.println(number));


        // the anatomy of a lambda expression
        // (number) is the argument
        // -> separates


    }
}
