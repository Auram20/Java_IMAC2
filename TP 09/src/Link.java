// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 9
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================


import java.util.Objects;


// 1.1 Link est publique , attributs  privés /  méthodes publiques
// 1.2 javac *.java && java Main

public class Link
{

// ================ ATTRIBUTS ================
    private Object value;
    private Link next;

// ================ CONSTRUCTEURS ================
    public Link(Object value) 
    {
        this.value = Objects.requireNonNull(value);
        this.next = null;
    }


// ================ METHODES ================
    boolean hasNext() 
    {
        return this.next != null;
    }

    public void setNext(Link next) 
    {
        this.next = next;
    }

    public Link getNext()  
    {
        return next;
    }

    public Object getValue() 
    {
        return value;
    }


    @Override
    public String toString() 
    {
        String str = this.value.toString() + " -> ";
        if (this.hasNext()) {
            return str + this.next.toString();
        }
        else {
            return str + "end";
        }
    }

    public boolean contains(Object o) 
    {
        if (o.equals(this.value)) {
            return true;
        } else {
            if (this.hasNext()) {
                return this.next.contains(o);
            }
            return false;
        }
    }





}
