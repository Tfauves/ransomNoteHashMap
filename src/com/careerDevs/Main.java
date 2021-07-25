package com.careerDevs;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {
	List<String> magazine = new ArrayList<>();
	List<String> note = new ArrayList<>();
	magazine.add("give me one grand today night");
	//magazine.add("meet me at midnight.");
		//magazine.add("two times three is not four");
	//note.add("give one grand today");
		//note.add("two times two is four");
	note.add("at midnight.");
	//note.add("this is some extra text.");

	checkMagazine(magazine, note);

    }


    public static void checkMagazine(List<String> magazine, List<String> note) {
    	HashMap<String, Integer> magMap = new HashMap<>();
    	HashMap<String, Integer> noteMap = new HashMap<>();

    	if (note.size() == 0 || note.size() > magazine.size()) {
			System.out.println("No");
		}
		for (String magWords : magazine) {
			if (magMap.containsKey(magWords)){
				magMap.put(magWords, magMap.get(magWords) + 1);

			} else {
				magMap.put(magWords, 1);
			}
		}

		for (String noteWords : note) {
			if (noteMap.containsKey(noteWords)) {
				noteMap.put(noteWords, noteMap.get(noteWords) + 1);

			}else {
				noteMap.put(noteWords, 1);
			}

		}

		for (String key : magMap.keySet()) {

			if (noteMap.containsKey(key)) {
				System.out.println("Yes");
				break;
			} else  {
				System.out.println("No");
				break;
			}
		}
//			System.out.println(magMap);
//
//			System.out.println(noteMap);





    }
}
