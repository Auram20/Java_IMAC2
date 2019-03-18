
// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 6
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================

// package fr.umlv.geom;

public class Point {
	//private final int x;
	//private final int y;
	private int x;
	private int y; 

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(Point p) 
	{
		this.x = p.x;
		this.y = p.y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "(" + x + ',' + y + ')';
	}
	
	public void translate(int dx, int dy) {
	  x += dx;
	  y += dy;
	}
}


// 1 . La fonction translate retourne des erreurs car 
// x et y sont des private final int, soit des constantes (final) qui ne peuvent pas être modifiées.