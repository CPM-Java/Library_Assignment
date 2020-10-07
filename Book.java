
/**
 * Sample Code for Array of Objects Assignment
 * Do not Modify
 * 
 * @author GrayKnight
 * @version Assign 7 example  9/21/05
 */
public class Book
{
    // instance variables describe the state of the book
    private String myAuthor;
    private String myTitle;
    private boolean isAvailable;

    /**
     * Constructor for objects of class Book
     */
    public Book(String title, String author)
    {
        myAuthor = author;
        myTitle = title;
        isAvailable = true;
    }
    
    //Accessor Methods
    public String getTitle()
    {
        return myTitle;
    }
    
    public String getAuthor()
    {
        return myAuthor;
    }
    
    public boolean onShelf()
    {
        return isAvailable;
    }
    
    //Mutator Methods   
    public void checkOut()
    {
        isAvailable = false;
    }
    
    public void checkIn()
    {
        isAvailable = true;
    }
    
    //toString
    public String toString()
    {
       String status = "'" + myTitle + "'; by " + myAuthor;
       if(isAvailable) status += " is available.";
       else status += " is unavailable.";
       return status;
    }
}
