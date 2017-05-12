package de.hpi.javaide.unittest;

public class Main {
	public static void main(String[] args) {
		OddnessTester ot = new OddnessTester();
		
		for (int i = -10; i <= 10; i++) {
			ot.isEven(i);
			ot.isOdd(i);
			System.out.println("isEven("+i+") == isOdd("+i+"): " + (ot.isEven(i) == ot.isOdd(i)));
		}
	}
}
