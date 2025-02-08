package pl.edu.agh.java.exercises.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Given n>=0, create an array length n*n with the following pattern, shown here
 * and in the unit tests: for n=3 : {0, 0, 1, 0, 2, 1, 3, 2, 1}
 * 
 * Dla zadanego n>=0 zwróć tablicę o długości n*n utworzoną wg wzoru podanego
 * tutaj oraz w testach jednostkowych: dla n=3: {0, 0, 1, 0, 2, 1, 3, 2, 1}
 * 
 *
 * @see http://codingbat.com/prob/p155405
 */
public class ArraySquareUp {
	public int[] squareUp(int n) {
		List<Integer> list = new ArrayList<>();
		int pointer;
		int[] tempArray = new int[n];

		for (int j = 0; j < n; j++) {
			pointer = n - j - 1;
			for (int i = 0; i < n; i++) {
				tempArray[i] = 0;
				if (i >= pointer){
					tempArray[i] = n - i;
				}
				list.add(tempArray[i]);
			}
		}
		int[] result = list.stream().mapToInt(i -> i).toArray();
		return result;
	}
}
