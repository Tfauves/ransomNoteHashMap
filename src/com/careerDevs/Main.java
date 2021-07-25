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
	magazine.add("this is text.");
	//magazine.add("meet me at midnight.");
	note.add("this is text.");
	//note.add("at midnight.");
	//note.add("this is some extra text.");

	checkMagazine(magazine, note);

    }


    public static void checkMagazine(List<String> magazine, List<String> note) {
    	HashMap<Integer, String> magMap = new HashMap<>();
    	HashMap<Integer, String> noteMap = new HashMap<>();
    	for (int i = 0; i < magazine.size(); i++) {
    		String magText = magazine.get(i);
    		magMap.put(i, magText);

    		for (int j = 0; j < note.size(); j++) {
    			String noteText = note.get(j);
    			noteMap.put(j, noteText);

    			if (magMap.equals(noteMap)) {
    				System.out.println("Yes");
    			} else {
    				System.out.println("No");
				}
			}
		}
			System.out.println(magMap);

			System.out.println(noteMap);





    }
}
