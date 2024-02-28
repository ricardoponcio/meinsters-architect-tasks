package architecttest.test3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SwapNumbers {

	private SwapNumbers() {

	}

	/**
	 * Write a Java program to swap two numbers without using the third variable.
	 * 
	 * @param source
	 * @return processed numbers
	 */
	public static Integer[] swapNumbers(Integer[] numbers) {
		if (numbers == null)
			return null;
		if (numbers.length != 2)
			return numbers;
		return new StringBuilder(
				Arrays.asList(numbers).stream().map(n -> String.valueOf(n)).reduce((t, u) -> t.concat(u)).orElse(null))
				.reverse().chars().mapToObj(c -> (char) c).map(c -> Integer.parseInt(String.valueOf(c)))
				.collect(Collectors.toList()).toArray(new Integer[] {});
	}

}
