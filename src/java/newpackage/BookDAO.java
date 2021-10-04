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
public class BookDAO implements IBookDAO {
    private ArrayList<Book> books;
    BookDAO () {
        books = new ArrayList<>();
        addBook(new Book("Тёмная сторона","Фрай Макс","Книги про волшебников, Героическое фэнтези, Фэнтези"));
    }
    @Override
    public void addBook(Book book) {
        if(!books.contains(book)) books.add(book);
    }
    
    @Override
    public void deleteBook(Book book) {
        if(books.contains(book))
             books.remove(book);
    }

    @Override
    public void editBook(Book oldBook, Book newBook) {
        if(!books.contains(oldBook)) return;
        deleteBook(oldBook);
        addBook(newBook);
    }

    @Override
    public Book getBook(String name, String authors) {
        for(Book book : books) {
            if(book.getName().equals(name) && book.getAuthors().equals(authors)) return book;
        }
        throw new IllegalArgumentException("Книжкі немає у базі");
    }

    @Override
    public ArrayList<Book> getBooks() {
        return books;
    }

    @Override
    public ArrayList<Book> getBooksByName(String name) {
        ArrayList<Book> searchResult = new ArrayList<>();
        for(Book book:books) {
            if(book.getName().equalsIgnoreCase(name)) searchResult.add(book);
        }
        return searchResult;
    }

    @Override
    public ArrayList<Book> getBooksByAuthors(String authors) {
         ArrayList<Book> searchResult = new ArrayList<>();
         String[] authorsByOne = authors.toLowerCase().split("[!?.,:;\\s\\n\\r]+");
         System.out.println(authors);
         for(String author :authorsByOne) {
                System.out.print(author+" ");
            }
         System.out.println();
        for(Book book:books) {
            boolean res = true;
            for(String author :authorsByOne) {
                if(!book.getAuthors().toLowerCase().contains(author)) {res = false; break;}
            }
            if(res) searchResult.add(book);
        }
        return searchResult;
    }

    @Override
    public ArrayList<Book> getBooksByKeyWords(String keyWords) {
        ArrayList<Book> searchResult = new ArrayList<>();
        
         String[] keyWordsByOne = keyWords.toLowerCase().split("[!?.,:;\\s\\n\\r]+");
        for(Book book:books) {
            boolean res = true;
            for(String keyWord :keyWordsByOne) {
                if(!book.getKeyWords().toLowerCase().contains(keyWord)) {res = false; break;}
            }
            if(res) searchResult.add(book);
        }
        return searchResult;
    }
    
}
