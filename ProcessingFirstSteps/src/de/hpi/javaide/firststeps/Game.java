package de.hpi.javaide.firststeps;

import processing.core.PApplet;

@SuppressWarnings("serial")
public class Game extends PApplet {
	
	// Aufgabe 1: Ändere den Code so ab, dass das Rechteck sichtbar wird.
	
	@Override
	public void setup() {
		noStroke();
		fill(255, 10, 10);
		rectMode(CORNER);
		// Die y-Position des Rechtecks war im negativen Bereich, daher außerhalb des sichtaren Fensterbereichs.
		rect(5, 10, 20, 10);
	}

	@Override
	public void draw() {

	}
	
}
