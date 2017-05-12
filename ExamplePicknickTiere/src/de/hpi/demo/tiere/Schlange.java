package de.hpi.demo.tiere;

public class Schlange extends Tier {
	
	public Schlange(String name){
		super(name);
	}

	@Override
	public String getGeraeusch() {
		return "Zzzzsss";
	}

}
