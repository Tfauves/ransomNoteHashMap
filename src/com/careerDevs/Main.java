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
	note.add("give one grand today");
		//note.add("two times two is four");
	//note.add("at midnight.");
	//note.add("this is some extra text.");

	checkMagazine(magazine, note);

    }


    public static void checkMagazine(List<String> magazine, List<String> note) {
		HashMap<String, Integer> wordMap = new HashMap<>();

		for (String words : magazine) {
			if (wordMap.containsKey(words)) {
				//if wordMap contains any of the words that are keys within the mag text.
				//if the word from magazine is in the wordMap count will increment and will be the value to the Key which is words.
				int count = wordMap.get(words);
				count++;
				wordMap.put(words, count);
			} else {
				//if the words from magazine are not in the map then they will be added and assigned the value of one.
				wordMap.put(words, 1);
			}
		}

		for (String words : note) {
			//Iterating through the note words.
			if (wordMap.containsKey(words)) {
				int count = wordMap.get(words);
				//if the count of the word from note is less than zero then the word is not present or it is not availble the amount of time we need so the text can not be used.
				if (count <= 0) {
					System.out.println("No");
					return;
				}
				//otherwise it must exist in map so we can use that word and decrement the count.
				count--;
				wordMap.put(words, count);
			}
			//if the magwords do not contain the words from note it fails.
			else if (!wordMap.containsKey(words)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");


	}

}







