package newpackage;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public interface IBookDAO {
    public void addBook(Book book);
    public void deleteBook(Book book);
    public void editBook(Book oldBook,Book newBook);
    public Book getBook(String name,String authors);
    public ArrayList<Book> getBooks();
    public ArrayList<Book> getBooksByName(String name);
    public ArrayList<Book> getBooksByAuthors(String authors);
    public ArrayList<Book> getBooksByKeyWords(String keyWords);
}
