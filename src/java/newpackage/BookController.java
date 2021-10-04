/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicReference;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
public class BookController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html; charset=UTF-8");
            request.setCharacterEncoding("UTF-8");
            String name = request.getParameter("name");
            String authors = request.getParameter("authors");
            BookService bs = new BookService();
            ServletContext servletContext = getServletContext();
            AtomicReference<BookDAO> bookDAO = (AtomicReference<BookDAO>)servletContext.getAttribute("bookDAO");
            request.setAttribute("book", bs.service(name, authors, bookDAO));
            String path = "/WEB-INF/jsp/book.jsp";
            RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
            requestDispatcher.forward(request, response);
    }

    
}
