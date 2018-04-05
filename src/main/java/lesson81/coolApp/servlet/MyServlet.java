package lesson81.coolApp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
    
    int counter = 0;
    private static final long serialVersionUID = -7187112104844868043L;
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        counter++;
        super.service(req, resp);
        /*if ("POST".equals(req.getMethod())) {
            doPost(req, resp);
        }
        if ("GET".equals(req.getMethod())) {
            doGet(req, resp);
        }*/
    }    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Inquiry accepted, GET");
        resp.getOutputStream().println("<h1>Hello</h1>");
    }
}
