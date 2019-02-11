// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 1 - Exo 02
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================



// ======================== PREMIER ARGUMENT ========================
   // public class PrintArgs 
   // {
   //      public static void main(String[] args) 
   //      {
   //        System.out.println(args[0]);
   //      }
   // }
     

// Que se passe-t'il si l'on ne passe pas d'argument lors de l'exécution du programme ?
// Une exception est lancée. 




// ======================== BOUCLE D'AFFICHAGE ========================
   // public class PrintArgs 
   // {
   //      public static void main(String[] args) 
   //      {
   //      	for(int i = 0; i <= args.length-1; i++)
   //  			{
   // 	   	    System.out.println(args[i]);	
   // 			}
   //      }
   // }


// ======================== FOR EACH ========================
   public class PrintArgs 
   {
        public static void main(String[] args) 
        {
        	for (String item : args) 
        	{
   				System.out.println(item);
			}
        }
   }
