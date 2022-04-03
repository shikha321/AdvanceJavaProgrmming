
package np.edu.scst.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class CookieDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = (String)request.getParameter("name");
         String email = (String)request.getParameter("email");
         Cookie cookieName = new Cookie("uname",name);
           Cookie cookieEmail = new Cookie("email",email);
           response.addCookie(cookieName);
           response.addCookie(cookieEmail);
           PrintWriter out = response.getWriter();
           out.println("Cookie sucessfully saved.<br>");
           out.println("<html><body><a href='getcookie'>Click me to access cookie</a></body></html>");
        
    }

   
    
}
