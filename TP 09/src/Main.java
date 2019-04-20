
// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 9
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================

import java.lang.*;

public class Main   
{ 

	public static void main(String[] args) 
	{
		
		
		String Ent=System.getProperty("line.separator");

		Link l1 = new Link(13); 
		Link l2 = new Link(144);
		System.out.print(l1 + Ent);
		
		LinkedLink<Integer> l3 = new LinkedLink<>();
		l3.add(31);
		l3.add(441);
		System.out.println(l3);
		System.out.println(l3.get(1));
		
		LinkedLink<String> l4 = new LinkedLink<>();
		l4.add("java");
		l4.add("de");
		l4.add("cours");
		System.out.println(l4);
		//System.out.println((String)(l4.get(1)).length());
		// No idea pk ça marche pas, même en castant
	
		// Un type paramètrique de forcer 1 seul type dans la chaîne

		System.out.println(l4.contains("cours"));
		System.out.println(l4.contains("matière"));

    }

}
