package architecttest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import architecttest.test2.RemoveSpaces;

public class RemoveSpacesTest {

	@Test
	public void happyPath() {
		String source = "First Test";
		String processed = RemoveSpaces.removeSpaces(source);

		assertEquals("FirstTest", processed);
	}

	@Test
	public void happyPathMultipleSpaces() {
		String source = "First Test With More Spaces";
		String processed = RemoveSpaces.removeSpaces(source);

		assertEquals("FirstTestWithMoreSpaces", processed);
	}

	@Test
	public void noneSpace() {
		String source = "Justonebigwordwithoutspaces";
		String processed = RemoveSpaces.removeSpaces(source);

		assertEquals(source, processed);
	}

	@Test
	public void emptyParameter() {
		String source = "";
		String processed = RemoveSpaces.removeSpaces(source);

		assertEquals("", processed);
	}

	@Test
	public void nullParameter() {
		String processed = RemoveSpaces.removeSpaces(null);
		assertEquals(null, processed);
	}

}
