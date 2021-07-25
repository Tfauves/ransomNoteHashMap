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
	magazine.add("this is some text.");
	magazine.add("meet me at midnight.");
	note.add("this is more text.");
	note.add("at midnight.");
	note.add("this is some extra text.");

	checkMagazine(magazine, note);

    }


    public static void checkMagazine(List<String> magazine, List<String> note) {
    	HashMap<Integer, String> magMap = new HashMap<>();
    	HashMap<Integer, String> noteMap = new HashMap<>();
    	for (int i = 0; i < magazine.size(); i++) {
    		String magText = magazine.get(i);
    		magMap.put(i, magText);
		}
			System.out.println(magMap);

    	for (int i = 0; i < note.size(); i++) {
    		String noteText = note.get(i);
    		noteMap.put(i, noteText);
		}
			System.out.println(noteMap);




    }
}
