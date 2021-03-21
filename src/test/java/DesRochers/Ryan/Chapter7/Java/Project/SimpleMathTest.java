package DesRochers.Ryan.Chapter7.Java.Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMathTest {

	@Test
	public void testThatZeroNumeratorReturnsZero() {
		SimpleMath tester = new SimpleMath();
		assertEquals(0,tester.divide(0, 7),0);
	}
	
	@Test
	public void testThatSmallerNumeratorReturnsDecimalValue() {
		SimpleMath tester = new SimpleMath();
		assertEquals(0.25,tester.divide(1, 4),0);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testThatZeroDenominatorThrowsException() {
		SimpleMath tester = new SimpleMath();
		tester.divide(6, 0);
	}

}
