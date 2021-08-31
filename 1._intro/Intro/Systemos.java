package Intro;

import java.util.ArrayList;

public class Systemos {

    public static class out{

        // Nogle primitive data typer der er 8 normalt
    public static void println(String s) {
        System.out.println(s);
    }

    public static void println(int i) {
        System.out.println(i);
    }

    public static void println(double o) {
        System.out.println(o);
    }

    public static void println(float f) {
        System.out.println(f);
    }

        public static void println(long l) {
            System.out.println(l);
        }

        public static void println(byte b) {
            System.out.println(b);
        }

        public static void println(char c) {
            System.out.println(c);
        }

        public static void println(boolean b) {
            System.out.println(b);
        }

        public static void println(Object[] content) {
        for (Object o : content) {
            System.out.print(o + " ");
        }
        }

        public static void println(ArrayList<Object> content) {
            for(int i = 0; i < content.size(); i++) {
                System.out.print(content.get(i) + " ");
            }
        }

        public static void println(Object content) {
            System.out.println(content);
        }

    }

}
