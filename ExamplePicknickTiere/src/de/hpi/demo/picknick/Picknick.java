package de.hpi.demo.picknick;

public class Picknick {

	static Essbar[] picknickkorb = new Essbar[2];
	
	public static void main (String args[]){
		Picknick picknick = new Picknick();
		picknick.essen();
	}
	
	/**
	 * Gibt die Inhalte des Arrays picknickkorb auf der Standardausgabe aus.
	 */
	public void essen(){
		picknickkorb[0] = new Zitrone();
		picknickkorb[1] = new Erdbeere();
		
		for (Essbar essbaresDing : picknickkorb) {
			if(Essbar.SUESS.equals(essbaresDing.getGeschmack())){
				System.out.println(essbaresDing + " schmeckt " + essbaresDing.getGeschmack());	
			}
		}
	}
	

}
