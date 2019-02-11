// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 1 - Exo 05
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================

// ======== CODE EN JAVA =========
   public class Pascal 
   {

        	public static int pascal (int nBut, int pBut){
               int[] tab = new int[nBut+1];
               int  n;
               int  i;
               tab[0] = 1;
               for(n=1; n<=nBut; n++)
               {
                 tab[n] = 1;
                 for(i=n-1; i>0; i--)
                   tab[i] = tab[i-1] + tab[i];
               }
               int result=tab[pBut];
               return result;
            }



            public static void main(String[] args) 
            {
               System.out.println(" Cn, p = "+ pascal (30000, 250));
            }

  }


// En C : 
//  0,26s user 0,00s system 98% cpu 0,272 total
// En Java : 
//  0,40s user 0,07s system 94% cpu 0,491 total

// Comment peut-on expliquer la différence de vitesse ?
//  Le Java passe  par une machine virtuelle, il doit passer par plusieurs couches afin de compiler et d'être executé. 
//  Le langage C est compilé en langage machine et exécuté par le processeur.