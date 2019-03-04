
// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 4 - Exo 02
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================


public class Book   
{ 
	
	private final String title; 
	private final String author; 

	public String getTitle()
	{
		return title;
	}

	public String getAuthor()
	{
		return author;
	}
	public Book(String pTitle, String pAuthor)
	{
	    title = pTitle;
	    author = pAuthor;
    }        
	public Book(String pTitle)
	{
	    title = pTitle;
	    author = "<no author>";
    }  

    public void compareBooks(Book book2)
    {

    	if ((this.title).compareTo(book2.getTitle())==0 && (this.author).compareTo(book2.getAuthor())==0)
    	{
	   	 	System.out.println("Ce sont les même livres.");
    	}
    	else 
    	{
    		System.out.println("Ce ne sont pas les même livres.");
    	}

    }

    @Override
	public boolean equals(Object o) 
	{
		return (o instanceof Book &&
				this.getTitle().equals(((Book) o).getTitle()) &&
				this.getAuthor().equals(((Book) o).getAuthor()));
		
	}
	
	@Override
	public String toString()
	{
		if (!author.equals("<no author>")) {
			return "ERROR";
		};
		return title + " by " + author;
	}
}

