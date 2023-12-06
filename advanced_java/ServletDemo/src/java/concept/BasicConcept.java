package concept;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



public class BasicConcept extends GenericServlet {

    @Override
    public void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException {
        PrintWriter out = sr1.getWriter();
        
        sr1.setContentType("text/html");
        
        out.println("<h1>Hello world</h1>");
    }
}
