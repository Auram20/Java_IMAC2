// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 3 - Exo 04
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================


public class Tri   
{ 

public static void main(String[] args) 
{


// ===========

	System.out.print("LE TABLEAU");
	int[] tab = {22, 192, 423, 3};
	for (int i=0; i<tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
	System.out.print(System.getProperty("line.separator"));


// ===========

	System.out.print("ON ECHANGE LE 3 eme et 4eme ELT : ");
	swap(tab, 2, 3);
	for (int i=0; i<tab.length; i++) {
		System.out.print(tab[i] + " ");
	}	
	System.out.print(System.getProperty("line.separator"));


// ===========

	System.out.print("INDICE DU MIN ENTRE 0 et 4eme ELT");
	int ind =indexOfMin(tab, 0, 3);
	System.out.print(ind + System.getProperty("line.separator"));

// ===========

	System.out.print("LE TABLEAU TRIE ");
	sort(tab);
	for (int i=0; i<tab.length; i++) {
		System.out.print(tab[i] + " ");
	}	
	System.out.print(System.getProperty("line.separator"));




}

// 01 - 

public static void swap(int[] array,int index1,int index2)
{
	if (index1 > array.length || index2 > array.length) 
			{
				 System.out.println("Indices incorrects");	    
			}
			int tmp = array[index1];
			array[index1] = array[index2];
			array[index2] = tmp;
}

// 02 - 
public static int indexOfMin(int[] array, int index1, int index2)
{
	if (index1 > array.length || index2 > array.length) 
			{
				 System.out.println("Indices incorrects");	    
			}
	int index = -1;
			int min = Integer.MAX_VALUE;
			for (int i=index1; i<index2; i++) {
				if (min > array[i]) {
					min = array[i];
					index = i;				
				}
			}
			return index;
}


// 03 - 
public static void sort(int[] array) 
{
	for (int i=0; i<array.length; i++) {
				int min = indexOfMin(array, i, array.length);
				if(min != i) {
					swap(array, i, min);
				}
			}		
}

}