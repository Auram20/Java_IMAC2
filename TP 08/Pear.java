// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 8
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================



public class Pear extends Fruit
{

// ================ ATTRIBUTS ================
    int _juice; 
    double _pearprice;

// ================ CONSTRUCTEURS ================

public Pear(int juice) 
    {
        assert juice >= 0 && juice <= 9 : "Juice must be between 0 and 9"; 
        this._juice = juice;
        this._pearprice = 3*juice;
        this._quantity += 1; 
    }

public Pear(int juice, int quantity) 
    {
        assert juice >= 0 && juice <= 9 : "Juice must be between 0 and 9"; 
        this._juice = juice;
        this._pearprice = 3*juice;
        this._quantity += quantity;
    }

// ================ METHODES ================

@Override
    public String toString() 
    {
        String Ent=System.getProperty("line.separator");
        return "Juice factor : " + this._juice + " Price : " + this._pearprice;
    }


}

