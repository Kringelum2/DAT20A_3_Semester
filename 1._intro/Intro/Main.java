package Intro;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Word[] wordArray = {new Word("Kurt"), new Word("Per"), new Word("Dorit"), new Word("Christian"), new Word("Peter")};

        ArrayList<Object> wordList = new ArrayList<>();
        wordList.add(new Word("Gert"));
        wordList.add(new Word("Knud"));
        wordList.add(new Word("Jan"));
        wordList.add(new Word("Erik"));
        wordList.add(new Word("Kaj"));


        Systemos.out.println("Spurgt");
        Systemos.out.println(5);
        Systemos.out.println(5.69);
        Systemos.out.println(new Word("Flødebolle"));
        Systemos.out.println(new OtherWord("hej"));
        Systemos.out.println(wordArray);
        Systemos.out.println(wordList);
    }

}