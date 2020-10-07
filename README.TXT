public class Library

public Library()
Constructor for objects of class Library

public void authorSort()
Sort the book objects alphabetically by author

public void checkBookIn(int indexNum)
Changes the status of a book to 'checked in'
Parameters:
indexNum - index number of the book

public void checkBookOut(int indexNum)
Changes the status of a book to 'checked out'
Parameters:
indexNum - index number of the book

public String inventory()
Return a String representing the libraries inventory of book objects
Returns:
a String representing the libraries inventory


public void newBook(String title, String author)
Instantiates a new book object and places it in the first null position in the array
Parameters:
title - book title as a String
author - book author as a String

public void titleSort()
Sort the book objects alphabetically by title