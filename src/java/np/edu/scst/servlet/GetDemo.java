
package np.edu.scst.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetDemo extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String name =(String)request.getParameter("name");
        String email =(String)request.getParameter("email");
        PrintWriter out = response.getWriter();
        out.println("hello"+name+"your email is"+email);
    }
}
