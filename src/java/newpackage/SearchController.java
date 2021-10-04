/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.IOException;
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
public class SearchController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        ServletContext servletContext = getServletContext();
        String text = request.getParameter("text");
        String type = request.getParameter("search");
        SearchService ss = new SearchService();
        AtomicReference<BookDAO> bookDAO = (AtomicReference<BookDAO>)servletContext.getAttribute("bookDAO");
        request.setAttribute("serchResult", ss.service(text, type, bookDAO));
        String path = "/WEB-INF/jsp/searchResult.jsp";
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
        requestDispatcher.forward(request, response);

        
    }

}
