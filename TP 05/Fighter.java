
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

	// 2.1  Un générateur pseudo aléatoire renvoie un résultat de manière aléatoire en apparence, mais qui est reproductible. 
	// Une meme graine, seed, donne toujours le même résultat.
	// 2.3 Sinon on aurait acces directement aux attributs et ça mauvais bail --> Utiliser des getters et setters plutôt 

	




}

