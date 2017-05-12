package de.hpi.demo.picknick;

public class Zitrone implements Essbar {

	@Override
	public String getGeschmack() {
		return "sauer";
	}
	
	public void schaelen(){
		System.out.println("Zitrone ist jetzt geschält.");
	}

	@Override
	public String toString() {
		return "Zitrone";
	}

}
