package com.ameen.logical;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PossibleSubstrings {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string ");
		String input = s.next();
		List<String> possibleSubStrings = findPS(input);
		possibleSubStrings.forEach(System.out::println);
		s.close();

	}

	public static List<String> findPS(String input) {
		List<String> outputList = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j <= input.length(); j++) {
				outputList.add(input.substring(i, j));
			}
		}
		return outputList;
	}
}
