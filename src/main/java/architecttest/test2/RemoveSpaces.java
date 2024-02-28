package architecttest.test2;

import java.util.stream.Collectors;

public class RemoveSpaces {

	private RemoveSpaces() {

	}

	/**
	 * Write a Java program to remove all white spaces from a string without using
	 * replace().
	 * 
	 * @param source
	 * @return processed string without spaces
	 */
	public static String removeSpaces(String source) {
		if (source == null)
			return null;
		return source.chars().mapToObj(c -> (char) c).filter(c -> c != ' ').map(String::valueOf)
				.collect(Collectors.joining());
	}

}
