// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 9
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================


import java.util.Objects;


// 1.1 Link est publique , attributs  privés /  méthodes publiques
// 1.2 javac *.java && java Main

public class LinkedLink<T> 
{

// ================ ATTRIBUTS ================
    private Link first;

// ================ CONSTRUCTEURS ================
    public LinkedLink() 
    {
        first = null;
    }

// ================ METHODES ================

    public void add(T value) 
    {
        Link link = new Link(value);
        link.setNext(this.first);
        this.first = link;
    }

    @Override
    public String toString() 
    {
        String str = "Linked link : ";
        if (this.first != null) {
            return str + this.first.toString();	
        } else {
            return str + "Fin";
        }
    }

    public Object get(int index) 
    {
		if (index < 0) throw new RuntimeException("Erreur index");
		int i = index;
		Link tmp = first;
		
        while(i > 0) 
        {
			if (tmp == null) throw new RuntimeException("Erreur index");
			tmp = tmp.getNext();
			i--;
		}

		if (tmp == null) throw new RuntimeException("Erreur index±");
		return tmp.getValue();
    }
    
    public boolean contains(Object obj) 
    {
		if (this.first == null) {
			return false;
		}
		else {
			return this.first.contains(obj);
		}
	}

}
