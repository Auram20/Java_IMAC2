// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 8
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================




public class Apple extends Fruit
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
        this._quantity += 1; 
    }

public Apple(double weight, String type, int quantity) 
    {
        this._type = type;
        this._weight = weight;
        this._appleprice = weight/2;
        this._quantity += quantity;
    }

// ================ METHODES ================

// getName to code before hash 
public String getName()
{
    return this._type;
}

@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
		result = prime * result + (int)_weight;
		return result;
	}

@Override
    public String toString() 
    {
        String Ent=System.getProperty("line.separator");
        return "Type : " + this._type + " Poids : " + this._weight + " Prix : " + this._appleprice;
    }


}

