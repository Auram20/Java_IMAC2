
// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 8
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================

import java.util.*;


public class Main   
{ 
    public static void main(String[] args) 
    {
        var apple1 = new Apple(20, "Golden");
        var apple2 = new Apple(40, "Pink Lady");
        var pear1 = new Pear(5);
        // System.out.print(apple1);
        // System.out.print(pear1);

        // var basket = new Basket();
        // basket.add(apple1);
        // basket.add(apple2);
        // basket.add(pear1);
        
// TEST QUANTITE
        var basket = new Basket();
        basket.add(apple1, 5);      // 5 pommes
        basket.add(apple2);
        basket.add(pear1, 7);        // 7 poires
  
        System.out.println(basket);


        // var set = new HashSet<Apple>();
        // set.add(new Apple(20, "Golden"));
        // System.out.println(set.contains(new Apple(20, "Golden")));


    }

      
}

