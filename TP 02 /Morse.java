
// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 2 - Exo 02
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================


public class Morse  
{ 
	public static void main(String[] args) 
	{

// 02. Les objets StringBuilder sont comme les objets String sauf que l'on peut les changer. D'où le fait que l'on renvoie un Stringbuilder, que l'on 
// peut modifier
// Le + peut être remplacé par un append. 
// Il faut lire : String newS=(new StringBuilder()).append("item").append(" Stop . ").toString(); 

	  		// var newS="";
			// for (String item : args) 
   			// {
  			//      		newS+=item+" Stop. ";
			// }

   			// 	System.out.println(newS);

// 03. Avec un StringBuilder : L'avantage est que l'on peut utiliser la méthode append autant que l'on veux, sans faire de copie.

			StringBuilder newS2= new StringBuilder();
			for (String item : args) 
   			{
  			     newS2.append(item).append(" Stop. ");		
			}
			System.out.println(newS2);


	}
}

