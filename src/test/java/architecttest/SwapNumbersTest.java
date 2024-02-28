package architecttest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import architecttest.test3.SwapNumbers;

public class SwapNumbersTest {

	@Test
	public void happyPath() {
		Integer[] source = new Integer[] { 9, 2 };
		Integer[] processed = SwapNumbers.swapNumbers(source);

		assertArrayEquals(new Integer[] { 2, 9 }, processed);
	}

	@Test
	public void emptyParameter() {
		Integer[] source = new Integer[] {};
		Integer[] processed = SwapNumbers.swapNumbers(source);

		assertArrayEquals(new String[] {}, processed);
	}

	@Test
	public void nullParameter() {
		Integer[] processed = SwapNumbers.swapNumbers(null);
		assertEquals(null, processed);
	}

}
