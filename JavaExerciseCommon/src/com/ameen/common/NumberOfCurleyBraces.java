package com.ameen.common;

public class NumberOfCurleyBraces {
	
	public int numberOfBraces(String inputString) {
		int counter = 0;
		for (char ch : inputString.toCharArray()) {
		    if (ch == '{') counter++;
		    else if (ch == '}') counter--;

		    if (counter < 0) break;
		}
		if (counter != 0) {
			error();
		}
		return 0;
	}
	
	private void error() {
		System.err.println("Not there");
	}

	public static void main(String[] args) {
		
	}

}
