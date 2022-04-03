<%@page import="java.util.*,java.math.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! //declaration tag || not a scriptlet tag
            int b=10;
            String s = "apple";
            Random rand = new Random();
            
            %>
       <% //scriptlet tag
           int a = 10;
           a++;
           //implicit object -> already present, no need to re-instantiate
           out.println(a);
           out.println(rand.nextInt(6)+1);
           out.println("hello from jsp page"+b); %>
           <%-- expresssion tag | no semicolons --%>
           <%= a %>
           <%= "Hello demo" %>
    </body>
</html>
