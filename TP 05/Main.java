
// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 5 - Exo 01
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================


import java.util.*;

public class Main   
{ 

	public static void main(String[] args) 
	{
                
                var D2R2Bot = new Robot("D2R2");
                var DataBot = new Robot("Data");   
                var myArena = new Arena();

                // System.out.println(D2R2Bot); 
                // System.out.println(DataBot);
                
                // Place au combat entre robots
                // myArena.fight(D2R2Bot,DataBot);
                // System.out.println("Le gagnant est le " + myArena.fight(D2R2Bot,DataBot));                      
	
                var LukeFighter = new Fighter("Luke",2);
                System.out.println(LukeFighter);
                
                myArena.fight(LukeFighter,DataBot);      
                System.out.println("Le gagnant est le " + myArena.fight(LukeFighter,DataBot));                      
        

                var john = new Fighter("John", 1);
                var jane = new Fighter("Jane", 2);
                System.out.println(myArena.fight(john, jane) + " wins !");
        }
}

// 2.9 Sous typage, on définit une classe fille plus spécifique 
// Polymorphisme, on redefinit une methode (override) dans une classe pour qu'elle change de comportements (ex println)

