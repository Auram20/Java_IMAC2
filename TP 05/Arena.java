
// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 5 - Exo 01
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================


public class Arena   
{ 

// ================ ATTRIBUTS ================

// ================ CONSTRUCTEURS ================

	public Arena()
	{
    }  


// ================ METHODES ================


  	public Robot fight(Robot bot1, Robot bot2)
  	{
  		while (bot1.isDead()==0 && bot2.isDead()==0)
  		{
  			if(bot1.isDead()==0)
  			{
  			bot1.fire(bot2);
  			}
  			if(bot2.isDead()==0)
  			{
  			bot2.fire(bot1);
  			}
        // else 
        // {
        //   try 
        //   {
        //   } catch (Exception e)
        // }
  			
  		}

  		return bot1.health > bot2.health ? bot1 : bot2;
  	}

}

