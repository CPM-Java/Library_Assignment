
/**
 * Example code of an array of book objects
 * 
 * @author GK CPM 2017 
 * @version 11/16/17
 */
public class Library
{
    //This is the instantiation of an array of objects of type Book.
    //There is 'space' for 50 books at this 'library'.
    private Book[] myBookArray = new Book[50];

    /**
     * Constructor for objects of class Library
     */
    public Library()
    {
        //each book object must be instantiated individually
        myBookArray[0] = new Book("Still Waters Run Deep", "Desmond");
        myBookArray[1] = new Book("Mathletic Manifesto", "Rachel");
        myBookArray[2] = new Book("LAX is Life", "Kate");
        myBookArray[3] = new Book("Harvard is the Fresno State of the East", "Andy");
        myBookArray[4] = new Book("Switched at Birth", "Sarah");
        myBookArray[5] = new Book("Deny Them All!", "Navneet");
        myBookArray[6] = new Book("All My Kids are Doctors", "Mr. C");
        myBookArray[7] = new Book("What Would Wooden Do?", "Wooden");
        
        //the other 42 remaining array elements are 'null' for now
    }

    
    /**
     * Return a String representing the libraries inventory of book objects
     * 
     * @return     a String representing the libraries inventory 
     */
    public String inventory()
    {
        return "Complete the inventory method";
    }
    
    /**
     * Instantiates a new book object and places it in the first null position in the array
     * 
     * @param  title   book title as a String
     * @param  author   book author as a String
     */
    public void newBook(String title, String author)
    {
        //complete the newBook method    
    }
    
    /**
     * Changes the status of a book to 'checked in'
     * 
     * @param  indexNum   index number of the book
     */
    public void checkBookIn(int indexNum)
    {
        //complete the checkBookIn method
    }
    
    /**
     * Changes the status of a book to 'checked out'
     * 
     * @param  indexNum   index number of the book
     */
    public void checkBookOut(int indexNum)
    {
        //notice how the array identifier and index number replace the object identifier when calling a method
        myBookArray[indexNum].checkOut();
    }
    
    
    //The following are some simplistic sorting implementations called "bubble sorts".
    //We will be looking at various sorting techniques in later chapters.
    
   /**
     * Sort the book objects alphabetically by title
     */
    public void titleSort()
    {
        int bookCount = 0;
        for(int x = 0; x < myBookArray.length; x++)
            if(myBookArray[x] != null) bookCount++;
        
        for(int z = 0; z < bookCount; z++){
            for(int x = 0; x < bookCount - 1; x++){
            
                //compare adjacent books, if their order is not alphabetical, swap them
                String title1 = myBookArray[x].getTitle().toLowerCase();
                String title2 = myBookArray[x + 1].getTitle().toLowerCase();
            
                if(title1.compareTo(title2) > 0){
                
                    //swap adjacent books on the shelf
                    Book tempBook = myBookArray[x];
                    myBookArray[x] = myBookArray[x + 1];
                    myBookArray[x + 1] = tempBook;
                }
            }
        }
    }
    
    /**
     * Sort the book objects alphabetically by author
     */
    public void authorSort()
    {
        int bookCount = 0;
        for(int x = 0; x < myBookArray.length; x++)
            if(myBookArray[x] != null) bookCount++;            
            
        for(int z = 0; z < bookCount; z++){    
            for(int x = 0; x < bookCount - 1; x++){
                String author1 = myBookArray[x].getAuthor().toLowerCase();
                String author2 = myBookArray[x + 1].getAuthor().toLowerCase();
                
                if(author1.compareTo(author2) > 0){
                    Book tempBook = myBookArray[x];
                    myBookArray[x] = myBookArray[x + 1];
                    myBookArray[x + 1] = tempBook;
                }
            }
        }
    }
}
