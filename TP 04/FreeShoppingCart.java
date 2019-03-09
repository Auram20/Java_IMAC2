// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 4 - Exo 03
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================


import java.util.*;

public class FreeShoppingCart   
{ 
    // 1 - Il faut spécifier le type Book de l'ArrayList 
    ArrayList<Book> listeBooks;

// ================ CONSTRUCTEUR ================
    public FreeShoppingCart()
    {
        this.listeBooks = new ArrayList<Book>();
    };



// ================ METHODES ================

    public void add(Book book)
    {
       this.listeBooks.add(book);
    };

// 2 - Index
    public void longestTitleIndex() 
    {	
		String longest = "";
		Book b = null;
        for (int i=0; i<this.listeBooks.size(); i++) 
        {
            if (this.listeBooks.get(i).getTitle().length() > longest.length()) 
            {
				longest = this.listeBooks.get(i).getTitle();
				b = this.listeBooks.get(i);
			}
        }
        System.out.print(" INDEX : Le titre le plus long est : " + longest + "\n");
    }

// 3 - Iterator
    public void longestTitleIterator() 
    {	
        String longest = "";
        Book b = null;
        Iterator<Book> it = this.listeBooks.iterator();
        while(it.hasNext())
        {
			Book tmp = it.next();
            if (tmp.getTitle().length() > longest.length())
            {
				longest = tmp.getTitle();
				b = tmp;
			}
		}
        System.out.print(" ITERATOR : Le titre le plus long est : " + longest + "\n");
    }
// 4 - Foreach : javap -c MonMain.class : Le compilateur crée une instance de la classe à chaque boucle
    public void longestTitleForEach() 
    {
        String longest ="";
        Book b = null;
        for(Book tmp : this.listeBooks) 
        {
            if (tmp.getTitle().length() > longest.length()) 
            {
                longest = tmp.getTitle();
                b = tmp;
            }
        }
    System.out.print(" FOR EACH : Le titre le plus long est : " + longest);
    }

// 5 - O(n)
    public void removeFirstOccurenceIterator(Book b) 
    {
        Iterator<Book> it = listeBooks.iterator();
        while (it.hasNext()) 
        {
            if (it.next().equals(b)) 
            {
                it.remove();
                break;
            }
        }
    }

// 6 -      
    public void removeFirstOccurence(Book book) 
    {
        this.listeBooks.remove(book);
    }


// 7 - on utilise un foreach quand on veut chercher pour chaque élément, un iterator quand on ne sait pas quel élement on cherche 


}

