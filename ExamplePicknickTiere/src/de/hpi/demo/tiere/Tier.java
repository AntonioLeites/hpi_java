package de.hpi.demo.tiere;

public abstract class Tier {
	
	protected String name;
	public abstract String getGeraeusch();
	
	public Tier(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

}


