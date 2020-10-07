
/**
 * Part of an example of using an array of objects
 * 
 * @author GK CPM 2017 
 * @version 11/16/17
 */

import java.util.Scanner;

public class LibrarianConsole
{
    // instance variables 
    private Scanner scan = new Scanner(System.in);// for numbers
    private Scanner scan2 = new Scanner(System.in);// for Strings
    private Library lib = new Library();

    /**
     * Constructor for objects of class SeatingChart
     */
    public void runConsole()
    {
       System.out.println(lib.inventory());
       
       int sentinel = 1;
       while(sentinel > 0 && sentinel < 6){
           System.out.println("1-New Book, 2-Sort Books by Author, " + 
                              "3-Sort Books by Title,\n4-Book Checkout, 5-Book Returned, 6-Quit");
           System.out.print("Choose:");
           sentinel = scan.nextInt();
           if(sentinel == 1) this.addBook();
           else if (sentinel == 2) lib.authorSort();
           else if (sentinel == 3) lib.titleSort();
           else if (sentinel == 4) this.bookCheckout();
           else if (sentinel == 5) this.bookReturn();
                     
           System.out.println(lib.inventory());
       }//end of while loop
       System.out.print("Goodbye!\n\n");
    }

    /**
     * Adds a book to the library
     */
    private void addBook()
    {
        System.out.print("Enter book title:");
        String titleStr = scan2.nextLine();
        System.out.print("Enter book author:");
        String authorStr = scan2.nextLine();
        lib.newBook(titleStr,authorStr);
                
    }
        
    /**
     * Changes the status of a book to "not available" 
     */
    private void bookCheckout()
    {
        System.out.print("Enter the index number of the book being checked-out:");
        int indexNum = scan.nextInt();
        lib.checkBookOut(indexNum);                
    }
    
    /**
     * Changes the status of a book to "available" 
     */
    private void bookReturn()
    {
        System.out.print("Enter the index number of the book being returned:");
        int indexNum = scan.nextInt();
        lib.checkBookIn(indexNum);                   
    }
}
