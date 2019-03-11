
// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 5 - Exo 01
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================


public class Robot   
{ 

// ================ ATTRIBUTS ================

	String name; 
	int health; 

// ================ CONSTRUCTEURS ================

	public Robot(String pName)
	{
	    name = pName;
	    health = 10;
    }  


// ================ METHODES ================

// 01 - On override la méthode toString pour bien avoir ce que l'on veut de printed
	public String toString() 
	{
     return("Robot : " + name);
  	}	
	
	public int isDead()
	{
		return (this.health==0) ? 1 : 0; 
	} 

  	public void fire(Robot bot2) 
  	{
  		// if ((bot2.isDead())==1)
  		// {
  		// 	throw new Exception("Code de déantologie : tir sur les morts")
  		// }
  		if ((bot2.isDead())==0)
  		{
  		bot2.health-=2;
  		System.out.println(bot2+" a été touché par " + this);
  		}
  	}



}

