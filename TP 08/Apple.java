// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 8
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================



public class Apple 
{

// ================ ATTRIBUTS ================
    String _type;
    double _weight; 
    double _appleprice;

// ================ CONSTRUCTEURS ================

public Apple(double weight, String type) 
    {
        this._type = type;
        this._weight = weight;
        this._appleprice = weight/2;
    }

// ================ METHODES ================

@Override
    public String toString() 
    {
        String Ent=System.getProperty("line.separator");
        return "Type : " + this._type + " Poids : " + this._weight + " Prix : " + this._appleprice;
    }


}

