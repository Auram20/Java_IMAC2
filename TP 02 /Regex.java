// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 2 - Exo 03 
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================


import java.util.regex.*; 

public class Regex
{
	public static void main(String[] args)
	{

// 01. A quoi servent la classe java.util.regex.Pattern et sa méthode compile ? A quoi sert la classe java.util.regex.Matcher ?
// Pattern est une classe qui encapsule une expression régulière donnée (chaîne de caractères, écrite dans une syntaxe particulière, propre à la bibliothèque d'expressions régulières que l'on utilise) 
// Cette classe a pour objet de compiler l'expression régulière fournie. D'où la méthode compile. 
// Matcher, permet de comparer une expression régulière à un texte, et de faire différentes opérations dessus.

// 02. Écrire un programme qui lit des chaînes de caractères sur la ligne de commande et affiche les chaînes qui correspondent à des nombres, c'est-à-dire les chaînes dont tous les caractères sont compris entre '0' et '9'.
	
		System.out.println("Les strings composées de nombres : ");
		for (String s : args) 
		{
			Pattern numberPattern = Pattern.compile("(\\D)");
			Matcher numberMatches = numberPattern.matcher(s);
			if (!numberMatches.find())
			{		
				System.out.print(s + " ");
			}
		}
       
// 03. Modifier le programme pour que, si une chaîne de caractères commence par des caractères qui ne sont pas des chiffres, ces chiffres soient également affichés (par exemple, avec les chaînes "abc", "ab3", "4de", "f6h" et "789", on affiche : "3 789").

		System.out.println(System.getProperty("line.separator") +"Les strings full nombres ou dernier caractère est un nombre : ");
		for (String s : args) 
		{
			Pattern pattern = Pattern.compile("\\d+$");
			Matcher lastMatches = pattern.matcher(s);
			if(lastMatches.find()) 
			{
				System.out.print(s + "  ");
			}
		}
// 04. Écrire une méthode qui prend en paramètre une chaîne de caractères contenant une adresse IPv4 et renvoie un tableau de 4 bytes. Il faut tester qu'il s'agit bien d'une adresse valide. Vous utiliserez pour cela la notion de groupe.

		System.out.println();
		System.out.println("Adresses IPv4 sont : ");
		for (String s : args) {
			
			Pattern pattern = Pattern.compile("^([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})$");
			Matcher matches = pattern.matcher(s);
			boolean adresse = matches.matches();
			if (adresse) 
			{
			
			boolean Octet = true;
			for(int i=1; i <= matches.groupCount(); i++) 
			{
				if (Integer.parseInt(matches.group(i)) > 255) 
				{
				Octet = false;
				}
				System.out.print(s + "  ");
			}
			}
		}

	}
}