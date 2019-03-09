
// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 4 - Exo 02
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================


import java.util.*;

public class ArrayShoppingCart   
{ 
	private Book[] liste;
    final private int max;
    private int current;

// ================ CONSTRUCTEUR ================
    public ArrayShoppingCart(int nbmax)
    {
        current=0;
        max=nbmax;
        liste = new Book[nbmax];
    };



// ================ METHODES ================
    public void displayList()
    {
        System.out.println("Nombres de livres : " + current);
        for (int i=0; i < current; i++) 
        {
            System.out.println(liste[i].getAuthor() + " - " + liste[i].getTitle());
		}
       
    }

     public void add(Book book)
    {
        if (current<max) 
        {
          liste[current]=book;
          current++;
        }
        else 
        {
            System.out.print("Liste pleine");
        }
    };


    public void longestTitle()
    {
        String longest="";
        for (int i=0; i < current; i++) 
        {
            if (liste[i].getTitle().length() > longest.length())
            {
                longest=liste[i].getTitle();
            }
        }
        System.out.print("Le titre le plus long est : " + longest + "\n");
    }

}

