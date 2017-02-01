package de.go2k.javadoku;

import java.awt.*;

public class GuiZeichnen extends Frame {
	public static void main(String args[]) {
		// Eine Instanz von EinfacheZeichnung erstellen
		GuiZeichnen z = new GuiZeichnen();
		// Größe und Titel des Fensters festlegen
		z.setSize(640, 480);
		z.setTitle("Die erste Java-Zeichnung");
		// Das Fenster anzeigen
		z.setVisible(true);
	}

	public void paint(Graphics g) {
		// Rotes Rechteck zeichnen
		g.setColor(Color.RED);
		g.fillRect(10, 10, 400, 150);
		// Grünes Dreieck zeichnen
		int[] xcoords = { 150, 270, 30 };
		int[] ycoords = { 180, 350, 350 };

		g.setColor(Color.GREEN);
		g.fillPolygon(xcoords, ycoords, xcoords.length);
		// Blauen Kreis zeichnen
		g.setColor(Color.BLUE);
		g.fillOval(250, 220, 120, 120);
	}
}
