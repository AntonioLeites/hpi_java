package de.hpi.demo.picknick;

public interface Essbar {
	String SUESS = "suess";
	String SAUER = "sauer";
	
	/**
	 * Gibt den Geschmack zurueck
	 * @return Geschmack in deutscher Sprache
	 */
	public default String getGeschmack(){
		return "undefiniert";
	};

}


