
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
        // System.out.print(apple1);

        var basket = new Basket();
        basket.add(apple1);
        basket.add(apple2);
        System.out.println(basket);


        var set = new HashSet<Apple>();
        set.add(new Apple(20, "Golden"));
        System.out.println(set.contains(new Apple(20, "Golden")));
    }

      
}

