package de.hpi.javaide.unittest;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.hpi.javaide.unittest.MyMath;


public class MyMathTest {

	MyMath mm;
	
	@Before
	public void setup() {
		 mm = new MyMath();
	}
	
	@Test
	public void testAdd() {
		assertEquals("Check your add method, the sum of 2 and 3 should be 5",5, mm.add(3, 2));
	}
	
	@Test
	public void testSubtract() {
		assertEquals("Check your subtract method",5, mm.subtract(10, 5));
		assertTrue("Also check your subtract method",7 == mm.subtract(10, 3));
	}
	
	@Test
	public void testChange() {
		System.out.println(mm.change(2.00, 1.10));
//		assertEquals("Beware of the double",0.90, mm.change(2.00, 1.10));
		assertEquals("Beware of the double",0.90, mm.change(2.00, 1.10), 0.001);
	}

}
