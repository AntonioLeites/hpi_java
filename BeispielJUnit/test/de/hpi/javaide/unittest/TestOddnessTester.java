package de.hpi.javaide.unittest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestOddnessTester {

	private OddnessTester ot;
	
	@Before
	public void setup() {
		ot = new OddnessTester();
		
	}
	
	@Test
	public void testOddity() {
		for (int i = -10; i <= 10; i++) {
			assertFalse(ot.isEven(i) == ot.isOdd(i));
			System.out.println("isEven("+i+") == isOdd("+i+"): " + (ot.isEven(i) == ot.isOdd(i)));
		}
	}

}
