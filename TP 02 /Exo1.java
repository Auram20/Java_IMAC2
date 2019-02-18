// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 2 - Exo 01
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================


public class Exo1 
{ 
	public static void main(String[] args) 
	{
		
		// 01 - Type de 's' : String
		// Méthodes prédéfinies en fonction du type : méthode de classe String 
		var s = "toto";
	   	System.out.println(s.length());


		// 02 - L'opérateur == ne teste pas si le contenu des strings sont les même, mais si ce sontles mêmes instances. 
		// Les strings en java sont immutables. Quand le constructeur d'un objet finit son execution, son instance ne peux plus être changée.
	    var s1 = "toto";
	    var s2 = s1;
	    var s3 = new String(s1);
	    System.out.println(s1 == s2);
	    System.out.println(s1 == s3);

		// 03 - On utilise la méthode compareTo qui retourne 0 si les deux strings ont le même contenu 
	    var s4 = "toto";
	    var s5 = new String(s4);
	    System.out.println(s4.compareTo(s5));

	    // 04 - Ça retourne true. Comme l'opérateur == compare les références et que s6 et s7 pointent vers le même objet string "toto"
	    // Ça nous retourne true. 
	    var s6 = "toto";
	    var s7 = "toto";
	    System.out.println(s6 == s7);

	    // 05 - Il est important que la classe String ne soit pas mutable pour :
	    // -  réduire les objets String temporairement en les partageant. Donc moins d'usage de mémoire.
	    // -  assurer la sécurité du code vu que les strings sont passés en paramètres de fonction plusieurs fois.
	    // -  répartir de manière homogène les valeurs sans devoir calculer à chaque fois le hashcode. 


	    // 06 - Le UpperCase ne change pas l'instance de s8 (mutable). D'où le fait que ça l'affiche en minuscule. 
 		var s8 = "hello";
      	s8.toUpperCase();
     	System.out.println(s8);
	}
}


