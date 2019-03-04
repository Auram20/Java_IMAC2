
// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 4 - Exo 02
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================


import java.util.*;

public class Main   
{ 

	public static void main(String[] args) 
	{

    
        var b1 = new Book("Da Java Code", "Duke Brown");
        var b2 = new Book("Le petit prince", "St. Ex");
        var monPanier = new ArrayShoppingCart(2); 
        monPanier.add(b1);
        monPanier.add(b2);
        monPanier.displayList();
        monPanier.longestTitle();



	}
}

