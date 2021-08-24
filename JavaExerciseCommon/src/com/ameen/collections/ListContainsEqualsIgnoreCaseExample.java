package com.ameen.collections;

import java.util.ArrayList;
import java.util.List;

public class ListContainsEqualsIgnoreCaseExample {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("Ameen");
		l1.add("NishA");
		l1.add("SaFaNa");
		l1.add("FamiLY");
		l1.add("TenKASI");
		
		String toBeSearched = "ameen";
		
		boolean anyMatch = l1.stream().anyMatch(toBeSearched::equalsIgnoreCase);
		System.err.println(anyMatch);
	}
}
