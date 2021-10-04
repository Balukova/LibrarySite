/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicReference;
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
public class AddController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html; charset=UTF-8");
            request.setCharacterEncoding("UTF-8");
            Book book = new Book(request.getParameter("name"),request.getParameter("authors"),request.getParameter("keyWords"));
            AddService as = new AddService();
            ServletContext servletContext = getServletContext();
            AtomicReference<BookDAO> bookDAO = (AtomicReference<BookDAO>)servletContext.getAttribute("bookDAO");
            as.service(book, bookDAO);
            String path = request.getContextPath()+"/options.jsp";
            response.sendRedirect(path);
    }

}
