// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 8
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================

import java.util.ArrayList; 

public class Basket 
{

// ================ ATTRIBUTS ================
    private Fruit[] _cart;
    int _basketquantity; 
    double _price;

    static final int MAX_IN_CART = 200;
    private int _current;

// ================ CONSTRUCTEURS ================
    public Basket() 
    {
        this._cart=new Fruit[MAX_IN_CART];
        this._price=0;
        this._current=0;
    }

// ================ METHODES ================

public void add(Fruit fruit)
    {
        if (_current<MAX_IN_CART) 
        {
          _cart[_current]=fruit;
          _current++;
          _basketquantity+=fruit._quantity;
        }
        else 
        {
            System.out.print("Panier plein");
        }

    }

public void add(Fruit fruit, int quantity)
    {
        if (_current<MAX_IN_CART) 
        {
          _cart[_current]=fruit;
          _current++;
          _basketquantity+=quantity;
        }
        else 
        {
            System.out.print("Panier plein");
        }

    }


@Override
public String toString() 
    {
        String Ent=System.getProperty("line.separator");
        String Basket = Ent + "Your Basket : ";
        
        for (int i=0; i < _current; i++) 
        {
            Basket+= Ent + _cart[i].toString();
        }
        Basket+= Ent + "Le nombre d'articles dans le panier : " + _basketquantity;
        return Basket;
    }


}
