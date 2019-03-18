	
// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 6
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================

// package fr.umlv.geom;

import java.lang.Math.*;

public class Circle 
{


// ================ ATTRIBUTS ================
	Point center;
	private int ray; 


// ================ CONSTRUCTEURS ================
	public Circle(Point center, int ray) 
	{
		this.center = new Point(center);
		this.ray = ray;
	}

	public int getRay() 
	{
		return ray;
	}

	public Point getCenter() 
	{
		return center;
	}

// ================ METHODES ================
	@Override
	public String toString() 
	{
		return "(" + center.getX() + ',' + center.getY() + ',' + this.getRay() + ',' + this.surface() +')' ;
	}

	public void translate(int dx, int dy) 
	{
		this.center.translate(dx, dy);
	}

	public double surface()
	{
		return Math.PI*Math.pow(ray, 2);
	}

	public boolean contains(Point p)
	{
		return ( Math.sqrt( Math.pow((p.getY()-this.center.getY()),2) + Math.pow((p.getX()-this.center.getX()),2)) < this.ray ) ? true : false; 
		
	}

	// 10. Le paramètre ... veut dire que l'on peut passer plusieurs Cercles en arguments de la fonction 

	public boolean contains(Point p, Circle... circles)
	{
		boolean isIt = true;
		for(Circle circle : circles)
		{
        	isIt=circle.contains(p);
    	}
    	return isIt;
	}

}


// 2. les mettre en privé et pour le constructeur récuperer les coordonnées du centre 