package architecttest.test1;

import java.util.List;
import java.util.stream.Collectors;

public class StartLetterA {
	
	private StartLetterA() {

	}

	/**
	 * Given a list of strings, write a method that returns a list of all strings that start with the letter ‘a’ 
	 * 	(lower case) and have exactly 3 letters. TIP: Use Java Lambdas and Streams API’s.
	 * 
	 * @param source
	 * @return processed list
	 */
	public static List<String> stringThatStartWithLetterA(List<String> source) {
		if (source == null)
			return null;
		return source.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());
	}

}
