package Functional_Programming;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        AbstractClass abstractClassImplemented = new AbstractClass() {

            @Override
            public void makeSurrealArt() {
                System.out.println("CHRISTIAN ER SØLV I LOL HAHA");
            }
        };

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String firstString, String secondString) {
                return firstString.compareTo(secondString);
            }
        };
        System.out.println(stringComparator.compare("Hello", "World"));

        Comparator<String> lambdaComparator = (String firstString, String secondString) -> firstString.compareTo(secondString); // Implementering i lambda form
        System.out.println(lambdaComparator.compare("a","b"));


        Concatenator concat = (prependorString, appendorString) -> prependorString + appendorString;

        System.out.println(concat.cat("Mind", "Blown"));

    }
}
