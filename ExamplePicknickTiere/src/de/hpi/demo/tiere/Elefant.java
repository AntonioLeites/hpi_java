package de.hpi.demo.tiere;

public class Elefant extends Tier {

	public Elefant(String name){
		super(name);
	}
	
	@Override
	public String getGeraeusch() {
		Math.pow(2, 3);
		return "Törööö";
	}

}

