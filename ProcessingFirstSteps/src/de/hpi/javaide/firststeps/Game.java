package de.hpi.javaide.firststeps;

import processing.core.PApplet;

@SuppressWarnings("serial")
public class Game extends PApplet {
	
	// Aufgabe 4: Ändere den Code so ab, dass du das Rechteck mit der Maus bewegen kannst.
	
	// Um eine Bewegung zu erzeugen brauchen wir zunächst variable Werte
	private int x;
	private int y;
	
	
	@Override
	public void setup() {
		// in der Setup Methode setzen wir die initialen Werte
		// Die Position 0/0 entspricht der linken oberen Ecke des Fensters
		this.x = 0;
		this.y = 0;
		
		// Hier zeichnen wir das Rechteck zum ersten Mal. 
		// Um den Code wenigstens etwas zu strukturieren haben wir dabei die Befehle in eine Methode verpackt, die wir nun an verschiedenen Stellen aufrufen können.
		drawRect(this.x , this.y);
	}

	/**
	 * Die von der PApplet Klasse (aus der Processing core.jar) geerbte draw() Methode wird hier überschrieben.
	 * Um den Aufruf dieser Methode muss ich mich nicht kümmern, dass übernimmt Processing für mich.
	 */
	@Override
	public void draw() {
		// Um dafür zu sorgen, dass sich das Rechteck tatsächlich bewegt, muss auch der Hintergrund immer wieder neu gemalt werden.
		background(0);
				
		// Das Rechteck wird immer wieder neu gezeichnet
		drawRect(this.x , this.y);
	}
	
	/**
	 * Anstatt das Rechteck mit dem Keyboard zu steuern, steuern wir es nun mit der Maus.
	 * Die mouseDragged() Methode wird immer dann aufgerufen wenn die Maus bei gedrückter Maustaste bewegt wird.
	 * 
	 * Ändere den Code bitte so, dass sich das Rechteck bewegt auch ohne, dass die Maustaste gedrückt ist.
	 */
	@Override
	public void mouseDragged() {
		// mouseX und mouseY sind von Processing gesetzte Wertein der die aktuelle Position der Maustaste gespeichert ist.
		this.x = mouseX;
		this.y = mouseY;
	}
	
	/**
	 * Die drawRect Methode zeichnet ein rotes Rechteck ohne Rand an der übergebenen x/y Position
	 * 
	 * @param x die x Position des Rechtecks als Ganzzahl (Integer)
	 * @param y die y Position des Rechtecks als Ganzzahl (Integer)
	 */
	private void drawRect(int x, int y) {
		noStroke();
		fill(255, 10, 10);
		rectMode(CORNER);
		// Die übergebenen x/y Werte werden an den Aufruf der Processing Methode zum Zeichnen eines Rechtecks weiter gegeben.
		rect(x, y, 10, 10);
	}
	
}

