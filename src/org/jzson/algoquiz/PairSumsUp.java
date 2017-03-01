package org.jzson.algoquiz;

import java.util.HashMap;
import java.util.Map;

public class PairSumsUp {

	public static void main(String args[]) {
		int[] input = { 4, 2, 8, 5, 2, 7, 7, 2, 6, 5 };

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();
		System.out.println(findSumUp2(input, 8));
	}

	private static boolean findSumUp(int[] ar, int value) {
		for (int i=0; i<ar.length; i++) {
			for (int j=0; j<ar.length; j++) {
				if (i != j) {
					if (ar[i] + ar[j] == value) {
						System.out.println(i+","+j);
						return true;
					}
				}
			}
		}
		
		return false;
	}

	private static boolean findSumUp2(int[] input, int value) {
	    Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

	    for(int i=0;i<input.length;i++){

	        if(pairs.containsKey(input[i])) {
	            System.out.println(input[i] +", "+ pairs.get(input[i]));
	            return true;
	        }
	        else
	            pairs.put(value-input[i], input[i]);
	    }
	    
	    return false;
	}
}