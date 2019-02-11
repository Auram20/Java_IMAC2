
// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 1 - Exo 03
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================


import java.util.Scanner; 

// ============= SCAN VALEUR =============
// public class Calc { 
// 	public static void main(String[] args) 
// 	{
// 		Scanner scanner;
// 		scanner = new Scanner(System.in);
// 		int value;
// 		value = scanner.nextInt(); 
// 	 	System.out.println("La valeur rentrée est :"+value);
// 	}
// }

// 2 - Indiquer dans le programme où sont les variables et quel est leur type associé. 
// Les variables sont dans values et sont de types Int, si elles avaient été d'un autre type on aurait appelé une méthode differente nextLong ou nextDouble...


// ============= UNE SEULE LIGNE ==============
// public class Calc { 
// 	public static void main(String[] args) 
// 	{
// 		Scanner scanner;
// 		scanner = new Scanner(System.in);
// 		int value = scanner.nextInt(); 
// 	 	System.out.println("La valeur rentrée est : "+value);
// 	}
// }

// 3 - Pourquoi nextInt() n'est pas une fonction ? 
// nextInt est une méthode associée à l'objet Scanner

// 4 - Expliquer la ligne : import java.util.Scanner;
// La ligne permet d'importer la bibliothèque java qui contient les définitions de l'objet Scanner 



// ================= CALCULATRICE ============= 
public class Calc { 
	public static void main(String[] args) 
	{
		Scanner scanner;
		scanner = new Scanner(System.in);
		int value = scanner.nextInt(); 
		int value2=scanner.nextInt();
	 	System.out.println("Les valeurs rentrées sont : "+value+" et " +value2);
	 	int sum=value+value2;
	 	int diff=value-value2;
	 	int diff2=-diff;
	 	float quotient=(float)value/value2;
	 	float quotient2=(float)value2/value;
	 	float reste=(float)value%value2;
	 	float reste2=(float)value2%value;

		String Newligne=System.getProperty("line.separator");
	 	System.out.println("============= OPERATIONS ==============");
	 	System.out.println( 
	 						value + "+" + value2 + "=" + sum + Newligne
	 						+value + "-" + value2 + "=" + diff + Newligne
	 						+value2 + "-" + value + "=" + diff2 + Newligne
	 						+value + "-" + value2 + "=" + diff + Newligne
	 						+value + "÷" + value2 + "=" + quotient +  Newligne
	 						+value2 + "÷" + value + "=" + quotient2 + Newligne
	 						+"Le reste de la div de " + value + " par " + value2 + " = " + reste + Newligne
	 						+"Le reste de la div de " + value2 + " par " + value + " = " + reste2
	 						);

	}
}