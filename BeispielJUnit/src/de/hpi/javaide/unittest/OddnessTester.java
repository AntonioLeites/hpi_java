package de.hpi.javaide.unittest;

public class OddnessTester {

    public boolean isOdd(int i) {
    	return i % 2 == 1;
        //return Math.abs(i % 2) == 1;
        //return ! isEven(i);
    }
    
    public boolean isEven(int i) {
        return i % 2 == 0;
    }
}
