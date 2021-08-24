package com.ameen.logical;

import java.util.HashMap;
import java.util.Map;

public class FindArrayTwoSum {
	
	private static int[] findTwoSumIndex(int[] array, int numberToBeFoundAsSum) {
		Map<Integer,Integer> trackerMap = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			int reminder = numberToBeFoundAsSum - array[i];
			if(trackerMap.containsKey(reminder)) {
				return new int[] {i,trackerMap.get(reminder)};
			}
			trackerMap.put(array[i], i);
		}
		//throw new IllegalArgumentException();
		return null;
	}
	
	
	public static void main(String[] args) {
		int[] array = {3,4,7};
		int findNo = 10;
		
		int[] findTwoSumIndex = findTwoSumIndex(array, findNo);
		for (int i = 0; i < findTwoSumIndex.length; i++) {
			System.out.println(findTwoSumIndex[i]);
		}
		
	}
	
}
