package concept;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "concept1", urlPatterns = {"/conc","/con"})
public class BasicConcept1 extends HttpServlet {

    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        String name = req.getParameter("nm");
        
        
        out.println("<body bgcolor = 'cyan'><center>");
        for(int i=0;i<7;i++){
            out.println("<h"+i+">Hello "+name+"....</h"+i+">");
        }        
        out.println("</center></body>");
    }
}
