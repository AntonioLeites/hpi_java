package de.hpi.demo.picknick;

public class Erdbeere implements Essbar {

	@Override
	public String getGeschmack() {
		return Essbar.SUESS;
	}
	
	@Override
	public String toString() {
		return "Erdbeere";
	}
	
}


