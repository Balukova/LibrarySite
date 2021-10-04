/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/**
 *
 * @author User
 */
public class SearchService {
    public ArrayList<Book> service(String text,String type,  AtomicReference<BookDAO> bookDAO) {
        System.out.println(text+ " "+type);
        switch(type) {
            case "name":
                return bookDAO.get().getBooksByName(text);
            case "author":
                return bookDAO.get().getBooksByAuthors(text);
            default:
                return bookDAO.get().getBooksByKeyWords(text);
        }
    }
}
