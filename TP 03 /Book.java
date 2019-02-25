
// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 3 - Exo 01
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================

import java.util.*;

public class Book   
{ 
	// 02. Un objet book est crée avec le constructeur par défaut. Ses attributs sont automatiquement mis à Null 
	// private String title;
	// private String author; 
	// public static void main(String[] args) 
	// {
	// 	   var book = new Book();
	//     System.out.println(book.title + ' ' + book.author);	    
	// }


	// 03. Pour que la classe Main reconnaisse la classe Book, il faut que ses attributs soient public et que les deux fichiers soient dans le même "package", même dossier en l'occurrence.
	// Autrement il faudra créer des packages pour pouvoir accéder aux sous-dossiers.
	// Si les attributs sont privés, Main.java ne pourra pas y accéder. Il faut les rendre public (bad ! )ou package friendly ( fait par défault ) .  
	// String title; 
	// String author; 

	// 04. Les 4 visibilités possibles : public, private, protected et package friendly 
	// Il faut toujours mettre en private pour éviter que les elements ne soient accessibles en dehors de la classe par n'importe quel autre classe.
	// En mettant les champs à private on respecte le principe d'encapsulation et on évite les problèmes de modification ou d'intrusion involontaire.

	// 05. Un accesseur est une méthode de la classe qui va permettre de récuperer la valeur de ses attributs. (Getter)
	// Ici si on a des attributs privés, il nous faudrait des accesseurs sur le title et le author. 

	// 06. Pour montrer que la valeur ne doit pas être modifiée on peut ajouter (static) final dans la déclaration de l'attribut. Celà montre qu'elle est constante. C'est important pour qu'il n'y ait pas de volonté de changement inutile. 

	private final String title; 
	private final String author; 

	public String getTitle()
	{
		return title;
	}

	public String getAuthor()
	{
		return author;
	}


	// 07. Le code du main ne fonctionne plus car on lui donne un nouveau constructeur. Il faut l'adapter et passer des attributs en paramètres. 
	public Book(String pTitle, String pAuthor)
	{
	    title = pTitle;
	    author = pAuthor;
    }        

    // 08. Les paramètres ne peuvent pas avoir le même nom que les attributs, autrement il y a confusion et le constructeur ne sais pas quelle valeur changer. 
	// public Book(String title, String author)
	// {
	//     System.out.println("Création d'un livre avec des paramètres !");
	//     title = title;
	//     author = author;
 	// }    

 	// 09. Constructeur qui prend juste un titre et pas d'auteur. Le champ author avec "<no author>".
 	public Book(String pTitle)
	{
	    title = pTitle;
	    author = "<no author>";
    }  

    // 10. En fonction des paramètres passés au constructeur. Le compilateur sait lequel appeler à partir de là. 
    // 11. Il faudrait utiliser le mot-clé this dans la définition de la classe.


    // ================== EXO 2 ====================

    // 01. La comparaison se fait entre les instances et non pas les champs strings. 
    // 02 . 
    public void compareBooks(Book book2)
    {

    	if ((this.title).compareTo(book2.getTitle())==0 && (this.author).compareTo(book2.getAuthor())==0)
    	{
	   	 	System.out.println("Ce sont les même livres.");
    	}
    	else 
    	{
    		System.out.println("Ce ne sont pas les même livres.");
    	}

    }

    // 03. La méthode indexOf retourne l'indice de la première occurrence de l'élément spécifié. Sinon retourne -1, si l'élément n'est pas dans la liste. 

    // 04. Note: Main.java uses unchecked or unsafe operations.
	// Note: Recompile with -Xlint:unchecked for details.
	// L'erreur vient du fait que l'on spécifie pas le type d'objets que l'on met dans le tableau.

}

