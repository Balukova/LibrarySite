/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.concurrent.atomic.AtomicReference;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author User
 */
public class ContextListener implements ServletContextListener {

    private AtomicReference<AdminDAO> adminDAO;
    private AtomicReference<BookDAO> bookDAO;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        adminDAO = new AtomicReference(new AdminDAO());
        bookDAO = new AtomicReference(new BookDAO());
        final ServletContext servletContext
                = sce.getServletContext();
        servletContext.setAttribute("adminDAO", adminDAO);
        servletContext.setAttribute("bookDAO", bookDAO);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        adminDAO = null;
        bookDAO = null;
    }
}
