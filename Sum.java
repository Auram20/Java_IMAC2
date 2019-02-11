// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 1 - Exo 04
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================

import java.lang.Integer;
import java.util.*;

   public class Sum 
   {

   		public static int[] charTointArray(String[] strAr)
   		{
   			System.out.println("===== TABLEAU =====");	
   			int intAr[] = new int[strAr.length];
   			for(int i = 0; i <= strAr.length-1; i++)
    			{
    				intAr[i]= Integer.parseInt(strAr[i]);
   	   	    		System.out.println(intAr[i]);	
   				}
   			return intAr;
   		}

   		public static int sumArray(int[] intAr)
   		{
   			int sum=0;
   			for(int i = 0; i <= intAr.length-1; i++)
    			{
    				sum+=intAr[i];
   				}
   			return sum;
   		}


        public static void main(String[] args) 
        {
        	System.out.println("===== SOMME ===== "+ System.getProperty("line.separator") + sumArray(charTointArray(args)));
        }

   }

// 2 - Que veut dire statique pour une méthode ?
// Statique permet d'appeler une fonction sans avoir besoin d'instancier la classe. 


// 3 - Que se passe-t'il lorsqu'un mot pris en argument n'est pas un nombre ?
// Ça lance une exception, c'est magique ! 