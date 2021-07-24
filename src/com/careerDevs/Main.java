package com.careerDevs;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<String> magazine1 = new ArrayList<>();
        List<String> note1 = new ArrayList<>();
        magazine1.add("Heres some text.");
        note1.add("Here's more text.");

        checkMagazine(magazine1, note1);
    }

    public static void checkMagazine(List<String> magazine, List<String> note) {
        String words = "";
        for (String sentence : magazine) {
            words += sentence;
            System.out.println(words);

        }



    }
}
