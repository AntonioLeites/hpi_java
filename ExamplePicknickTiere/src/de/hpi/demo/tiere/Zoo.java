package de.hpi.demo.tiere;

public class Zoo {

	public static void main(String[] args) {
		Tier [] meineTiere = new Tier[2];
		
		meineTiere[0] = new Elefant("Elmar");
		meineTiere[1] = new Schlange("Kaaa");
		
		for (int i = 0; i < meineTiere.length; i++) {
			Tier meinTier = meineTiere[i];
			System.out.println(meinTier.getName() + ": " + meinTier.getGeraeusch());
		}
	}

}
