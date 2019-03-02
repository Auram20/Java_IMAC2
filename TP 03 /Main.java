
// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 3 - Exo 01 à 03
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================


import java.util.*;

public class Main   
{ 

	public static void main(String[] args) 
	{
		// var book = new Book(); 
		var book = new Book("Les misérables","Victor Hugo");
		var book1 = new Book("L'étranger");
	    System.out.println(book.getTitle() + ' ' + book.getAuthor());
	    System.out.println(book1.getTitle() + ' ' + book1.getAuthor());

        // ======EXO 02 ====== 
	    System.out.println("____________________________");
	    var b1 = new Book("Da Java Code", "Duke Brown");
        var b2 = b1;
        var b3 = new Book("Da Java Code", "Duke Brown");
        System.out.println(b1 == b2); // true 
        System.out.println(b1 == b3); // false
        // ============ 

        b1.compareBooks(b2);
        b1.compareBooks(b3);
		
		// ============ 
		List<Book> list = new ArrayList<>();
        list.add(b1);
        System.out.println(list.indexOf(b2));
        System.out.println(list.indexOf(b3));


        // ===========
       // var aBook = new Book(null, null);
       // var anotherBook = new Book(null, null);
       // var list1 = new ArrayList();
       // list1.add(aBook);
       // System.out.println(list1.indexOf(anotherBook));


	}
}

