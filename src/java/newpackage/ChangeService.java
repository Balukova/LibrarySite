/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.concurrent.atomic.AtomicReference;

/**
 *
 * @author User
 */
public class ChangeService {
    public void service(String name,String authors,Book newBook,AtomicReference<BookDAO> bookDAO ) {
        Book oldBook = bookDAO.get().getBook(name, authors);
        bookDAO.get().editBook(oldBook, newBook);
    }
}
