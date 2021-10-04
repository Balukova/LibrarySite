/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.IOException;
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
public class EnterController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String button = request.getParameter("enter");
        ServletContext servletContext = getServletContext();
        EnterService es = new EnterService();
        AtomicReference<AdminDAO> adminDAO = (AtomicReference<AdminDAO>)servletContext.getAttribute("adminDAO");
        HttpSession session = request.getSession();
        session.setAttribute("login", login);
        es.service(login, password,button, adminDAO);
        String path = request.getContextPath()+"/options.jsp";
        response.sendRedirect(path);
    }
}
