
package np.edu.scst.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCookie extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       Cookie[] cookies = request.getCookies();
       PrintWriter out=response.getWriter();
        out.println("your cookies are:<br>");
       for(Cookie cookie :cookies){
          out.println(cookie.getName()+":"+cookie.getValue());
           System.out.println(cookie.getName()+":"+cookie.getValue());
           
       } 
           
    }

    
}
