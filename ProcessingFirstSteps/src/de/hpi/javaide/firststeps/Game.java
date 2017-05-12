package de.hpi.javaide.firststeps;

import processing.core.PApplet;

@SuppressWarnings("serial")
public class Game extends PApplet {
	
	// Aufgabe 1: Ändere den Code so ab, dass das Rechteck sichtbar wird.
	// Aufgabe 2: Ändere den Code so ab, dass das Rechteck sich von der linken oberen Ecke in die rechte untere Ecke bewegt.
	// Aufgabe 3: Ändere den Code so ab, dass du das Rechteck mit der Tastatur bewegen kannst.
	// Aufgabe 4: Ändere den Code so ab, dass du das Rechteck mit der Maus bewegen kannst.
	
	@Override
	public void setup() {
		noStroke();
		fill(255, 10, 10);
		rectMode(CORNER);
		rect(5, -100, 20, 10);
	}

	@Override
	public void draw() {

	}
}
