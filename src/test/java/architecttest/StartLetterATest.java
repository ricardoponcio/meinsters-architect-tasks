package architecttest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import architecttest.test1.StartLetterA;

public class StartLetterATest {

	@Test
	public void happyPath() {
		List<String> source = Arrays.asList("test", "arc", "java", "architect");
		List<String> processed = StartLetterA.stringThatStartWithLetterA(source);

		assertArrayEquals(new String[] { "arc" }, processed.toArray());
	}

	@Test
	public void happyPathMultipleWords() {
		List<String> source = Arrays.asList("test", "arc", "java", "architect", "ant");
		List<String> processed = StartLetterA.stringThatStartWithLetterA(source);

		assertArrayEquals(new String[] { "arc", "ant" }, processed.toArray());
	}

	@Test
	public void anyMatchWords() {
		List<String> source = Arrays.asList("test", "java", "architect", "Ant");
		List<String> processed = StartLetterA.stringThatStartWithLetterA(source);

		assertArrayEquals(new String[] {}, processed.toArray());
	}

	@Test
	public void emptyParameter() {
		List<String> source = Arrays.asList();
		List<String> processed = StartLetterA.stringThatStartWithLetterA(source);

		assertArrayEquals(new String[] {}, processed.toArray());
	}

	@Test
	public void nullParameter() {
		List<String> processed = StartLetterA.stringThatStartWithLetterA(null);
		assertEquals(null, processed);
	}

}
