	
// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 6
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================

// package fr.umlv.geom;

import java.lang.Math.*;

public class Ring extends Circle
{

// 1 -  
// ================ ATTRIBUTS ================
	private int innerRay; 


// ================ CONSTRUCTEURS ================

	public Ring(Point center, int ray) 
	{
		super(center, ray);		
	}

// 4 - on lance une exception dans le cas contraire 
	public Ring(Point center, int ray, int innerRay) throws Exception 
	{
		this(center, ray);
		if (innerRay >= ray) 
			{
				throw new Exception("inner ray should be smaller than ray.");
			}
		this.innerRay = innerRay;
	}

// ================ METHODES ================
	@Override
	public String toString() 
	{
		return super.toString() + " InternalRadius:" + this.innerRay;
	}

	@Override
	public boolean contains(Point p) 
	{
		Circle interne = new Circle(getCenter(), innerRay);
		return super.contains(p) && !(interne.contains(p));
	}

	// 2.3 - On en conclut que l'héritage +++ 

}