package com.ameen.logical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingChar {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string ");
		String input = s.next();
		List<String> possibleSubStrings = PossibleSubstrings.findPS(input);
		String longestStringWithNonRepeativeChar = findLongestStringWithNonRepeativeChar(possibleSubStrings);
		System.out.println("Longest String with non repeating char " + longestStringWithNonRepeativeChar);

		s.close();
	}

	private static String findLongestStringWithNonRepeativeChar(List<String> possibleSubStrings) {
		List<String> list = new ArrayList<>();
		possibleSubStrings.stream().forEach(eachString -> {
			System.out.println("Current String ... " + eachString);

			Map<Character, Integer> charCountMap = new HashMap<>();
			for (int i = 0; i < eachString.length(); i++) {
				char key = eachString.charAt(i);
				Integer value = charCountMap.get(eachString.charAt(i));

				if (value != null && value > 0) {
					break;
				} else {
					charCountMap.put(key, 1);
				}
				System.out.println(charCountMap);
				if (i == eachString.length() - 1) {
					list.add(eachString);
				}
			}

		});
		System.err.println(list);
		
		String longestString = list.get(0);
		for (String element : list) {
			if (element.length() > longestString.length()) {
				longestString = element;
			}
		}
		return longestString;
	}
}
