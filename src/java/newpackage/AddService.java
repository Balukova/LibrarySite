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
public class AddService {
    public void service(Book book, AtomicReference<BookDAO> bookDAO) {
        bookDAO.get().addBook(book);
    }
}
