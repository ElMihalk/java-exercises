package pl.edu.agh.java.exercises.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Given an array, return true if there is a place to split the array so that
 * the sum of the numbers on one side is equal to the sum of the numbers on the
 * other side.
 * 
 * Dla zadanej tablicy zwróć true, jeśli da się tak rozmieścić jej elementy, że
 * suma jej elementów w lewej i w prawej połowie będzie równa.
 * 
 * @see http://codingbat.com/prob/p158767
 */
public class ArrayBalance {
	public boolean canBalance(int[] array) {
//		throw new UnsupportedOperationException();
		if (array == null || array.length <= 1) {
			return true;
		}
		for (int i = 0; i < array.length - 1; i++) {
			int[] array_left = Arrays.copyOfRange(array, 0, i+1);
			int[] array_right = Arrays.copyOfRange(array, i + 1, array.length);
			int sum_left = IntStream.of(array_left).sum();
			int sum_right = IntStream.of(array_right).sum();
			if (sum_left == sum_right) {
				return true;
			}
		}
		return false;
	}
}
