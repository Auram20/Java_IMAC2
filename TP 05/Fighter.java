
// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 5 - Exo 02
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================


import java.util.Random ;

public class Fighter extends Robot
{ 

// ================ ATTRIBUTS ================
	// Hérités de Robot 
	Random random; 

// ================ CONSTRUCTEURS ================

	public Fighter(String pName, long seed)
	{
		super(pName);
		this.random = new Random(seed);
	}  
// ================ METHODES ================

@Override
	public String toString() 
	{
     return("Fighter : " + name);
  	}	


@Override
  	public void fire(Robot bot)  
  	{
		if(random.nextBoolean())
			super.fire(bot);
		else
			System.out.println(this + " à raté sa cible.");
	}  	





}

